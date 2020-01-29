package moreinjectiondagger.di

import dagger.Component
import moreinjectiondagger.ProviderRepeatApplication

@Component
interface AppComponent {

  //fun app(): Application
  //fun app(): LazyApplication
  //fun app(): ProviderApplication
  //fun app(): LazyRepeatApplication
  fun app(): ProviderRepeatApplication
}