import { Component, OnInit } from "@angular/core";
import { ProductService } from "./product.service";
@Component({
    selector:'product-list',
    templateUrl:'./product-list.component.html',
    providers: [ProductService]
})
export class ProductListComponent implements OnInit
{
    productList:any[]=[];
    constructor(private productService:ProductService){}
    ngOnInit()
     {
        this.productService.getALLProductDetails().subscribe((data) => this.productList=data);

    }

}