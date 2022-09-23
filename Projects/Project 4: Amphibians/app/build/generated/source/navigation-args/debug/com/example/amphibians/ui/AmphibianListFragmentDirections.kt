package com.example.amphibians.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.amphibians.R

public class AmphibianListFragmentDirections private constructor() {
  public companion object {
    public fun actionAmphibianListFragmentToAmphibianDetailFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_amphibianListFragment_to_amphibianDetailFragment)
  }
}
