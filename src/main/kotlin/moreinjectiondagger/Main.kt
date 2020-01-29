package moreinjectiondagger

import moreinjectiondagger.di.DaggerAppComponent

fun main() {
  DaggerAppComponent
    .create()
    .app()
    .execute()
}