import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from '../dashboard/dashboard.component';
import { ExtraComponent } from '../extra/extra.component';

const routes: Routes = [
  
  { path:'dd', component: DashboardComponent, },
  { path:'information', component: ExtraComponent }

];

@NgModule({
  declarations: [],
  
  imports: [
    RouterModule.forRoot(routes)
  ],
  
  exports: [
    RouterModule
  ]

})
export class AppRoutingModule { 

}
