package com.example.saramnexttosaram.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

class BaseViewModel: ViewModel(){

    private val composite = CompositeDisposable()

    fun addDisposable(disposable: Disposable) = composite.add(disposable)

    override fun onCleared() {
        composite.clear()
        super.onCleared()
    }
}