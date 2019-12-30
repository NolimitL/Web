import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DateComponent } from './date/date.component';
import { AddressCardComponent } from './address-card/address-card.component';
import { ExtraComponent } from './extra/extra.component';
import { FuntionalService } from './funtional.service';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HomeComponent } from './home/home.component';
import { SettingsComponent } from './settings/settings.component';
import { ProfileComponent } from './profile/profile.component';

@NgModule({
  declarations: [   //Add COMPONENTS which you need
    AppComponent,
    DateComponent,
    AddressCardComponent,
    ExtraComponent,
    DashboardComponent,
    HomeComponent,
    SettingsComponent,
    ProfileComponent
  ],
  imports: [    //Add MODULS which you need
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
  ],
  providers: [    //Add SERVICES which you need
    FuntionalService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
