package com.example.amphibians;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.amphibians.databinding.FragmentAmphibianDetailBindingImpl;
import com.example.amphibians.databinding.FragmentAmphibianListBindingImpl;
import com.example.amphibians.databinding.ListViewItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTAMPHIBIANDETAIL = 1;

  private static final int LAYOUT_FRAGMENTAMPHIBIANLIST = 2;

  private static final int LAYOUT_LISTVIEWITEM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.amphibians.R.layout.fragment_amphibian_detail, LAYOUT_FRAGMENTAMPHIBIANDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.amphibians.R.layout.fragment_amphibian_list, LAYOUT_FRAGMENTAMPHIBIANLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.amphibians.R.layout.list_view_item, LAYOUT_LISTVIEWITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTAMPHIBIANDETAIL: {
          if ("layout/fragment_amphibian_detail_0".equals(tag)) {
            return new FragmentAmphibianDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_amphibian_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAMPHIBIANLIST: {
          if ("layout/fragment_amphibian_list_0".equals(tag)) {
            return new FragmentAmphibianListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_amphibian_list is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWITEM: {
          if ("layout/list_view_item_0".equals(tag)) {
            return new ListViewItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_view_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "amphibian");
      sKeys.put(2, "clickListener");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_amphibian_detail_0", com.example.amphibians.R.layout.fragment_amphibian_detail);
      sKeys.put("layout/fragment_amphibian_list_0", com.example.amphibians.R.layout.fragment_amphibian_list);
      sKeys.put("layout/list_view_item_0", com.example.amphibians.R.layout.list_view_item);
    }
  }
}
