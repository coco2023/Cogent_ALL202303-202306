# Main
fuse-demo-v17.2.0.zip   : Fuse Demo Project <br>
fuse-starter-v17.2.0.zip: Fuse Starter Project

# ONLINE DOC
http://angular-material.fusetheme.com/docs/guides/getting-started/introduction

# Make Change
when we wanna make Changes:
in `fuse-demo-v17.2.0\src\app\mock-api\common\navigation\data.ts`, comment all unnecessary element in the code
```
/* eslint-disable */
import { FuseNavigationItem } from '@fuse/components/navigation';

export const defaultNavigation: FuseNavigationItem[] = [

];
```

only leave the useful part, example:
```
/* tslint:disable:max-line-length */
import { FuseNavigationItem } from '@fuse/components/navigation';

export const defaultNavigation: FuseNavigationItem[] = [
    {
        id   : 'example',
        title: 'Example',
        type : 'basic',
        icon : 'heroicons_outline:chart-pie',
        link : '/example'
    },
    {
        id   : 'dashboards',
        title: 'Dashboards',
        type : 'basic',
        icon : 'heroicons_outline:chart-pie',
        link : '/dashboards/project'
    }
];
export const compactNavigation: FuseNavigationItem[] = [
    {
        id   : 'example',
        title: 'Example',
        type : 'basic',
        icon : 'heroicons_outline:chart-pie',
        link : '/example'
    }
];
export const futuristicNavigation: FuseNavigationItem[] = [
    {
        id   : 'example',
        title: 'Example',
        type : 'basic',
        icon : 'heroicons_outline:chart-pie',
        link : '/example'
    },
    {
        id   : 'dashboards',
        title: 'Dashboards',
        type : 'basic',
        icon : 'heroicons_outline:chart-pie',
        link : '/dashboards/project'
    }
];
export const horizontalNavigation: FuseNavigationItem[] = [
    {
        id   : 'example',
        title: 'Example',
        type : 'basic',
        icon : 'heroicons_outline:chart-pie',
        link : '/example'
    }
];

```

## Steps -- futuristic
file in 
`fuse-starter-v17.2.0\src\app\layout\layouts\vertical\futuristic\futuristic.component.html`
 only controls the basic content part, not the navigation part

```
<!-- Loading bar -->
<fuse-loading-bar>
<p>fuse-loading-bar</p>
</fuse-loading-bar>

<!-- Navigation -->
<fuse-vertical-navigation
    class="dark bg-indigo-800 text-white print:hidden"
    [mode]="isScreenSmall ? 'over' : 'side'"
    [name]="'mainNavigation'"
    [navigation]="navigation.futuristic"
    [opened]="!isScreenSmall">
    <!-- Navigation header hook -->
    <ng-container fuseVerticalNavigationHeader>
        <!-- Logo -->
        <p>Logo</p>
        <p>this is the nav-header</p>
        <hr>
    </ng-container>
    <ng-container>
        <p>this is nav-content</p>
    </ng-container>
    <!-- Navigation footer hook -->
    <ng-container fuseVerticalNavigationFooter>
        <hr>
        <p>this is nav-footer</p>
       
    </ng-container>
</fuse-vertical-navigation>

<!-- Wrapper -->
<div class="flex flex-col flex-auto w-full min-w-0">

    <!-- Header -->
    <div class="relative flex flex-0 items-center w-full h-16 px-4 md:px-6 z-49 shadow dark:shadow-none dark:border-b bg-card dark:bg-transparent print:hidden">


</div>

<!-- Quick chat -->

```
but found this part is editing the content, not `navigate`


\<fuse-vertical-navigation-basic-item class="ng-tns-c74-14 ng-star-inserted" ng-reflect-item="[object Object]" ng-reflect-name="mainNavigation"></fuse-vertical-navigation-basic-item>

goto find element: \<fuse-vertical-navigation-basic-item />

find: \<fuse-vertical-navigation />

this is a component in @fuse folder, so, goto `src\@fuse\components\navigation\vertical`

test navigation here
```
<div class="fuse-vertical-navigation-wrapper">

    <!-- Header -->
    <div class="fuse-vertical-navigation-header">
        <ng-content select="[fuseVerticalNavigationHeader]"></ng-content>
        <P>fuse-vertical-navigation-header</P>
        <p>=======================</p>
    </div>

    <!-- Content -->
    <div
        class="fuse-vertical-navigation-content"
        fuseScrollbar
        [fuseScrollbarOptions]="{wheelPropagation: inner, suppressScrollX: true}"
        #navigationContent>

        <!-- Content header -->
        <div class="fuse-vertical-navigation-content-header">
            <p>====fuse-vertical-navigation-content-header====</p>
            <ng-content select="[fuseVerticalNavigationContentHeader]"></ng-content>
        </div>

        <!-- Items -->
        <ng-container *ngFor="let item of navigation; trackBy: trackByFn">
            <p>***fuse-vertical-navigation-content-Items***</p>
            <p>111</p>
            <p>222</p>
            <p>333</p>
...
</ng-container>
```

found example is here: `basic` tag

```
                <p>555</p>
                <!-- Basic -->
                <ng-container *ngIf="item.type === 'basic'">
                    <p>ng-container-basic</p>
                    <p>here to edit the Components elements</p>
                    <fuse-vertical-navigation-basic-item
                        [item]="item"
                        [name]="name">
                        console.log(item.type)
                    </fuse-vertical-navigation-basic-item>
                </ng-container>

                <p>666</p>
```

goto `src\@fuse\components\navigation\vertical\vertical.component.ts` 
> FuseVerticalNavigationComponent

find this component will be used in method in `FuturisticLayoutComponent` 
```
        // Get the navigation
        const navigation = this._fuseNavigationService.getComponent<FuseVerticalNavigationComponent>(name);

```

not a useful index, but found `FuseNavigationItem` here
```
    @Input() navigation: FuseNavigationItem[];
```

goto `src\@fuse\components\navigation\navigation.types.ts` and found the other file `fuse-starter-v17.2.0\src\app\mock-api\common\navigation\data.ts` used `FuseNavigationItem`, goto this file

change the json data in navigation bar, success!

## change setting
change the setting here: `src\app\layout\common\settings`

change the default setting of `setting` button, path: `fuse-starter-v17.2.0\src\app\core\config\app.config.ts`
```
    layout : 'classic',
```

`setting` button disappear - comment: 
```
<!-- <div
    class="settings-cog fixed flex items-center justify-center right-0 w-10 h-10 shadow-lg rounded-l-lg z-90 cursor-pointer bg-red-600 bg-opacity-90 print:hidden"
    [class.lg:right-0]="config.layout === 'centered' || config.layout === 'material'"
    [class.lg:right-16]="config.layout !== 'centered' && config.layout !== 'material'"
    style="top: 275px"
    (click)="settingsDrawer.toggle()">
    <mat-icon
        class="icon-size-5 text-white animate-spin-slow"
        [svgIcon]="'heroicons_solid:cog'"></mat-icon>
</div> -->
```
path:  `src\app\layout\common\settings\settings.component.html`


## inventory picture
chang mock data in: `src\app\mock-api\apps\ecommerce\inventory\data.ts`
and save product pictures here: `src\assets\images\apps\ecommerce\products`















































