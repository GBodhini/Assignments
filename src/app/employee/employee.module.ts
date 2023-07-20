import { NgModule } from "@angular/core";
import { EmployeeListComponent } from "./employee-list.component";
import { FormsModule } from "@angular/forms";
import { CommonModule } from "@angular/common";
@NgModule({
    declarations:[EmployeeListComponent],
    imports:[FormsModule,CommonModule],
    exports:[EmployeeListComponent],
    providers:[]

})
export class EmployeeModule
{

}