package istic.edu.pocosmdroid;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;

import org.osmdroid.ResourceProxy;
import org.osmdroid.tileprovider.MapTileProviderBase;
import org.osmdroid.views.MapView;

public class ZoomLimitMapView extends MapView
{
    protected ZoomLimitMapView(Context context, ResourceProxy resourceProxy, MapTileProviderBase tileProvider, Handler tileRequestCompleteHandler, AttributeSet attrs) {
        super(context, resourceProxy, tileProvider, tileRequestCompleteHandler, attrs);
    }
    /* snip the constructors */

    @Override
    public int getMaxZoomLevel()
    {
        return 4;
    }
}