
import { Component, Inject, OnInit } from '@angular/core';
import { IProduct } from '../model/product';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.scss']
})
export class ProductDetailComponent implements OnInit {
  product : IProduct ;
  id : number;
  constructor(public dialogRef: MatDialogRef<ProductDetailComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any ) { }

  ngOnInit(): void {

}
onCancel(): void {
  this.dialogRef.close();
  this.dialogRef.afterClosed().subscribe(result => {
    console.log(`Dialog result: ${result}`);
  })
  }
}
