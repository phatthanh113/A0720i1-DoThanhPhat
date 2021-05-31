import { ImageGalleryModule } from './_8_module_DI/image-gallery/image-gallery.module';
import { ProductService } from './product.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule, FormGroup, FormsModule } from '@angular/forms';
import { BlogComponent } from './_8_module_DI/blog/blog.component';
import { MusicPlayerComponent } from './_7_service_router/music-player/music-player.component';
import { DictionaryComponent } from './_7_service_router/dictionary/dictionary.component';
import { ImgSliderModule } from './_8_module_DI/img-slider/img-slider.module';
@NgModule({
  declarations: [
    BlogComponent,
    MusicPlayerComponent,
    DictionaryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    ImageGalleryModule,
    ImgSliderModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
