import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ProfilePanelComponent } from './profile-panel/profile-panel.component';
import { RegisterComponent } from './register/register.component';
import { Statement } from '@angular/compiler';
import { ViewStatementComponent } from './view-statement/view-statement.component';

const routes: Routes = [
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
