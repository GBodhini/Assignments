import { Component } from "@angular/core";
import { Employee } from "./employee";
import { empdata } from "./employee-data";

@Component({
    selector:'emp-list',
    templateUrl: './employee-list.component.html'

})
export class EmployeeListComponent
{
    empList: Employee[]=empdata;
    public deleteEmployeeRow(index:number)
    {
       this.empList.splice(index,1);
    }
}
