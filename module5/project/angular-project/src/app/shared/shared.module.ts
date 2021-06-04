import { ProductsModule } from './../products/products.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { MatDialogModule  } from '@angular/material/dialog';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input'
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import { MatDaterangepickerModule } from 'mat-daterangepicker';
import { MatMomentDateModule } from '@angular/material-moment-adapter';
import {MatPaginatorModule} from '@angular/material/paginator';
import {NgxPaginationModule} from 'ngx-pagination';
import {MatTableModule} from '@angular/material/table';
import { MatIconModule } from '@angular/material/icon'
import {MatRadioModule} from '@angular/material/radio';
import { MatButtonModule } from '@angular/material/button';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ],
  exports:    [
    CommonModule,
    ReactiveFormsModule,
    FormsModule,
    Ng2SearchPipeModule,
    HttpClientModule,
    MatDaterangepickerModule,
    NgxPaginationModule,
    [MatDialogModule,MatButtonModule,MatFormFieldModule,MatDatepickerModule,MatNativeDateModule,MatMomentDateModule,MatInputModule,MatIconModule,MatPaginatorModule,MatTableModule,MatRadioModule]
  ]
})
export class SharedModule { }
