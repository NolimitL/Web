import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ExtraComponent } from './extra/extra.component';
import { AddressCardComponent } from './address-card/address-card.component';
import { HomeComponent } from './home/home.component';
import { SettingsComponent } from './settings/settings.component';
import { ProfileComponent } from './profile/profile.component';


const routes: Routes = [
  { path: '', redirectTo:'/home', pathMatch:'full'}, //prefix or full
  { path: 'home', component: HomeComponent },
  { 
    path: 'settings', 
    component: SettingsComponent, 
    children:[
        {path: 'profile', component: ProfileComponent}
      //{path: 'profile', component: ProfileComponent},
    ] },
  { path: 'dd', component: DashboardComponent },
  { path: 'extra', component: ExtraComponent },
  { path: 'address', component: AddressCardComponent }
  // { path: '**', component: ErrorComponent} - если перенаправить на какую нибудь 
  //                                            другую ссылку в сайте которой нет то все они 
  //                                            будут отображать компонент ErrorComponent, который 
  //                                            есть определенная страница сайта
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
