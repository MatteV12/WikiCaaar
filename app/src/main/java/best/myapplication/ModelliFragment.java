package best.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ModelliFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    ArrayList<String> tot;
    ArrayList<String> modelli;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ModelliFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ModelliFragment newInstance(String param1, String param2) {
        ModelliFragment fragment = new ModelliFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_auto_modelli, container, false);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            tot = bundle.getStringArrayList("modelli");
            modelli = new ArrayList<>(tot);

            for(int i = 1; i < modelli.size(); i++){
                modelli.remove(i);
            }
            final ListView listview = (ListView) view.findViewById(R.id.listview);
            final ListAdapter adapter = new ArrayAdapter<>(getContext(),
                    android.R.layout.simple_list_item_1,modelli);
            if(listview!=null)
                listview.setAdapter(adapter);

            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position,
                                        long id) {
                    FragmentManager fragmentmanager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentmanager.beginTransaction();
                    DescrizioneFragment autodescrizionefragment = new DescrizioneFragment();
                    final Bundle bundle = new Bundle();
                    for(int i = 0; i < tot.size(); i++){
                        Log.i(String.valueOf(i), tot.get(i));
                    }

                    bundle.putString("modello",tot.get((position*2)+1));
                    autodescrizionefragment.setArguments(bundle);
                    fragmentTransaction.replace(R.id.fragmentcontainer,autodescrizionefragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }
            });
        }
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}