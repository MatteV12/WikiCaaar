package best.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;

class ImageGetter implements Html.ImageGetter {

    Context parentContext;

    public ImageGetter(Context parentContext){
        this.parentContext = parentContext;
    }

    public Drawable getDrawable(String source) {
        int id;

        id =  parentContext.getResources().getIdentifier(source, "drawable", parentContext.getPackageName());

        if (id == 0) {
            // the drawable resource wasn't found in our package, maybe it is a stock android drawable?
            id = parentContext.getResources().getIdentifier(source, "drawable", "android");
        }

        if (id == 0) {
            // prevent a crash if the resource still can't be found
            return null;
        }
        else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity)parentContext).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int altezza = displayMetrics.heightPixels;
            int larghezza = displayMetrics.widthPixels;
            Resources r = parentContext.getResources();
            float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 14, r.getDisplayMetrics());
            Log.i("dimensioni",String.valueOf(px));
            Drawable d = parentContext.getResources().getDrawable(id);
            int altimg = d.getIntrinsicHeight()/3;
            int largimg = d.getIntrinsicWidth()/3;
            //calcola la proporzione fra la grandezza dell'immagine e quella dello schermo per adattarla
            if(largimg > larghezza) {
                int temp = largimg;
                Log.i("prima", String.valueOf(largimg));
                largimg /= (temp/larghezza);
                Log.i("dopo", String.valueOf(largimg));
                altimg /= (temp/larghezza);
            }
            d.setBounds(0,0,largimg,altimg);
            return d;
        }
    }

}