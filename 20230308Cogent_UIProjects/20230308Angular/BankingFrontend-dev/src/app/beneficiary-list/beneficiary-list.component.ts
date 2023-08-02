import { Component, OnInit } from '@angular/core';
import { Beneficiary } from './beneficiary.model';
import { BeneficiaryService } from './beneficiary.service';

@Component({
  selector: 'app-beneficiary-list',
  templateUrl: './beneficiary-list.component.html',
  styleUrls: ['./beneficiary-list.component.css']
})
export class BeneficiaryListComponent implements OnInit {

  beneficiaries: Beneficiary[] = [];

  constructor(private beneficiaryService: BeneficiaryService) { }

  ngOnInit(): void {
    // fetch the list of beneficiaries from a service
    this.beneficiaryService.getBeneficiaries().subscribe(
      (result) => {
        console.log("this is result", result)
        this.beneficiaries = result;
        console.log("this is result", this.beneficiaries[0])
      },
      (error) => {
        console.log('Failed to fetch beneficiaries', error);
      }
    );
  }

  onApproveBeneficiary(beneficiary: Beneficiary) {
    // update the beneficiary's status to 'approved'
    beneficiary.approved = "YES";
    this.beneficiaryService.approveBeneficiary(beneficiary).subscribe(
      (res) => {
        beneficiary.approved = res.approved;
      },
      (error) => {
        console.log('Failed to fetch beneficiaries', error);
      }
    );
  }
}
