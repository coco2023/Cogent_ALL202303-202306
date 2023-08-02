import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Payload } from '../CustomersAccount';

@Component({
  selector: 'app-transfer-money',
  templateUrl: './transfer-money.component.html',
  styleUrls: ['./transfer-money.component.css']
})
export class TransferMoneyComponent implements OnInit{

  // @Output() changeSelectedValue = new EventEmitter<string>();

  // constructor(private httpClient: HttpClient,private router: Router, private payloadService: PayloadService, private accountService: CustomerAccountService, private userService: UserServiceService) {}

  // selectedValue: string | null = 'Transfer Money';

  // onSelectedValueChange(value: string) {
  //   this.selectedValue = value;
  // }

  // onSubmit() {
  //   const customerId = this.userService.getCurrentUser()["customerId"];
  //   const fromAccountNo = this.payloadService.getPayload()["fromAccNumber"];
  //   const toAccNumber = this.payloadService.getPayload()["toAccNumber"];
  //   const amount = this.payloadService.getPayload()["amount"];
  //   const reason = this.payloadService.getPayload()["reason"];

  //   const obj = new Payload(fromAccountNo, toAccNumber, amount, reason);
  //   console.log(obj)
  //   this.payloadService.postPayload(obj).subscribe((result) => {
  //     this.changeSelectedValue.emit('Transfer Money');
  //   })

  // }

  constructor(private httpClient: HttpClient,private router: Router) {}

  get f(){
    return this.payloadFrom.controls;
  }

  payloadFrom = new FormGroup({
    fromAccountNo: new FormControl('', [Validators.required]),
    toAccNumber: new FormControl('', [Validators.required]),
    amount: new FormControl('', [Validators.required]),
    reason: new FormControl('', [Validators.required])
  });

  payload: Payload = new Payload();
  private posAccounttUri = 'http://localhost:8080/api/customer/transfer'
  
  post(){
    this.payload.fromAccNumber = this.f["fromAccountNo"].value;
    this.payload.toAccNumber = this.f["toAccNumber"].value;
    this.payload.amount = this.f["amount"].value;
    this.payload.reason = this.f["reason"].value;

  }

  ngOnInit(): void {}

  // accountList
  choice: string;
  textInput: string;
  accountList: any[] = [
    { accNo: 1, Balance: '1000', accType: "SB", selected: false },
    { accNo: 2, Balance: '2000', accType: "CA", selected: false },
    { accNo: 3, Balance: '3000', accType: "SB", selected: false }
  ];

  selectedAccount: any;

  selectItem(item: any) {
    this.selectedAccount = item;
  }


}
