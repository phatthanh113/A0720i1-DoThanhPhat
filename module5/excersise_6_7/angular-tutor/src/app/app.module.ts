import { ImageGalleryModule } from './_8_module_DI/image-gallery/image-gallery.module';
import { ProductService } from './product.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule, FormGroup, FormsModule } from '@angular/forms';
import { BlogComponent } from './_8_module_DI/blog/blog.component';
@NgModule({
  declarations: [
    BlogComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    ImageGalleryModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
