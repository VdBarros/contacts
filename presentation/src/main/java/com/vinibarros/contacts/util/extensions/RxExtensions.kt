package com.vinibarros.contacts.util.extensions

import com.vinibarros.domain.util.provider.SchedulerProvider
import io.reactivex.Single

fun <T> Single<T>.defaultScheduler(schedulerProvider: SchedulerProvider): Single<T> {
    return this.subscribeOn(schedulerProvider.io()).observeOn(schedulerProvider.main())
}