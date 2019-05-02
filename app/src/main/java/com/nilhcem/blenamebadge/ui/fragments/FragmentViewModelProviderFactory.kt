package com.nilhcem.blenamebadge.ui.fragments

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nilhcem.blenamebadge.data.badge_preview.PreviewRepository
import com.nilhcem.blenamebadge.data.fragments.FilesRepository
import com.nilhcem.blenamebadge.ui.fragments.base.BaseFragmentViewModel

class FragmentViewModelProviderFactory(private val configRepository: FilesRepository, private val previewRepo: PreviewRepository)
    : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return BaseFragmentViewModel(configRepository, previewRepo) as T
    }
}