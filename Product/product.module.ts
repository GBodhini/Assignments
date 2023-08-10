import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { HttpClientModule } from "@angular/common/http";
import { ProductService } from "./product.service";
import { ProductListComponent } from "./product-list.component";
@NgModule({
    declarations:[ProductListComponent],
    imports:[HttpClientModule,CommonModule],
    exports:[ProductListComponent],
    providers:[ProductService]
})
export class Productmodule
{

}
