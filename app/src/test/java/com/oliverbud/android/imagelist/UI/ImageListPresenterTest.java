package com.oliverbud.android.imagelist.UI;

import com.oliverbud.android.imagelist.ImageIDKeeper;
import com.oliverbud.android.imagelist.Networking.NetworkManager;
import com.oliverbud.android.imagelist.UI.Util.ImageDataItem;

import junit.framework.TestCase;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

/**
 * Created by oliverbudiardjo on 7/2/15.
 */
public class ImageListPresenterTest extends TestCase {

    ImageListView view = new ImageListView() {
        @Override
        public void displayLoading() {

        }

        @Override
        public void setItems(ArrayList<ImageDataItem> listData) {

        }

        @Override
        public void updateItems(int position) {

        }

        @Override
        public void displayError() {

        }
    };

    ImageIDKeeper keeper = new ImageIDKeeper();

    NetworkManager manager = Mockito.mock(NetworkManager.class);

    ImageListPresenter presenter = new ImageListPresenter(view, manager, keeper);

    @Test
    public void testPresenter(){
        presenter.searchFor("feet");
        presenter.loadMore("feet");
        presenter.loadMore("feet");

        assertEquals(2, presenter.page);

    }

}