# CoreCalendarGetCalendarEventById200ResponseEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | Pointer to [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction.md) |  | [optional] 
**Activityname** | Pointer to **string** | activityname | [optional] 
**Activitystr** | Pointer to **string** | activitystr | [optional] 
**Candelete** | **bool** | candelete | 
**Canedit** | **bool** | canedit | 
**Category** | Pointer to [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory.md) |  | [optional] 
**Categoryid** | Pointer to **int32** | categoryid | [optional] 
**Component** | Pointer to **string** | component | [optional] 
**Course** | Pointer to [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse.md) |  | [optional] 
**Deleteurl** | **string** | deleteurl | 
**Description** | Pointer to **string** | description | [optional] 
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Editurl** | **string** | editurl | 
**Eventcount** | Pointer to **int32** | eventcount | [optional] 
**Eventtype** | **string** | eventtype | 
**Formattedlocation** | **string** | formattedlocation | 
**Formattedtime** | **string** | formattedtime | 
**Groupid** | Pointer to **int32** | groupid | [optional] 
**Groupname** | Pointer to **string** | groupname | [optional] 
**Icon** | [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon.md) |  | 
**Id** | **int32** | id | 
**Instance** | Pointer to **int32** | instance | [optional] 
**Isactionevent** | **bool** | isactionevent | 
**Iscategoryevent** | **bool** | iscategoryevent | 
**Iscourseevent** | **bool** | iscourseevent | 
**Location** | Pointer to **string** | location | [optional] 
**Modulename** | Pointer to **string** | modulename | [optional] 
**Name** | **string** | name | 
**Normalisedeventtype** | **string** | normalisedeventtype | 
**Normalisedeventtypetext** | **string** | normalisedeventtypetext | 
**Overdue** | Pointer to **bool** | overdue | [optional] [default to false]
**Purpose** | **string** | purpose | 
**Repeatid** | Pointer to **int32** | repeatid | [optional] 
**Subscription** | Pointer to [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.md) |  | [optional] 
**Timeduration** | **int32** | timeduration | 
**Timemodified** | **int32** | timemodified | 
**Timesort** | **int32** | timesort | 
**Timestart** | **int32** | timestart | 
**Timeusermidnight** | **int32** | timeusermidnight | 
**Url** | **string** | url | 
**Userid** | Pointer to **int32** | userid | [optional] 
**Viewurl** | **string** | viewurl | 
**Visible** | **int32** | visible | 

## Methods

### NewCoreCalendarGetCalendarEventById200ResponseEvent

`func NewCoreCalendarGetCalendarEventById200ResponseEvent(candelete bool, canedit bool, deleteurl string, editurl string, eventtype string, formattedlocation string, formattedtime string, icon CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon, id int32, isactionevent bool, iscategoryevent bool, iscourseevent bool, name string, normalisedeventtype string, normalisedeventtypetext string, purpose string, timeduration int32, timemodified int32, timesort int32, timestart int32, timeusermidnight int32, url string, viewurl string, visible int32, ) *CoreCalendarGetCalendarEventById200ResponseEvent`

NewCoreCalendarGetCalendarEventById200ResponseEvent instantiates a new CoreCalendarGetCalendarEventById200ResponseEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarEventById200ResponseEventWithDefaults

`func NewCoreCalendarGetCalendarEventById200ResponseEventWithDefaults() *CoreCalendarGetCalendarEventById200ResponseEvent`

NewCoreCalendarGetCalendarEventById200ResponseEventWithDefaults instantiates a new CoreCalendarGetCalendarEventById200ResponseEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetAction() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetActionOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetAction(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction)`

SetAction sets Action field to given value.

### HasAction

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasAction() bool`

HasAction returns a boolean if a field has been set.

### GetActivityname

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetActivityname() string`

GetActivityname returns the Activityname field if non-nil, zero value otherwise.

### GetActivitynameOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetActivitynameOk() (*string, bool)`

GetActivitynameOk returns a tuple with the Activityname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityname

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetActivityname(v string)`

SetActivityname sets Activityname field to given value.

### HasActivityname

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasActivityname() bool`

HasActivityname returns a boolean if a field has been set.

### GetActivitystr

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetActivitystr() string`

GetActivitystr returns the Activitystr field if non-nil, zero value otherwise.

### GetActivitystrOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetActivitystrOk() (*string, bool)`

GetActivitystrOk returns a tuple with the Activitystr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivitystr

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetActivitystr(v string)`

SetActivitystr sets Activitystr field to given value.

### HasActivitystr

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasActivitystr() bool`

HasActivitystr returns a boolean if a field has been set.

### GetCandelete

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetCandelete() bool`

GetCandelete returns the Candelete field if non-nil, zero value otherwise.

### GetCandeleteOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetCandeleteOk() (*bool, bool)`

GetCandeleteOk returns a tuple with the Candelete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandelete

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetCandelete(v bool)`

SetCandelete sets Candelete field to given value.


### GetCanedit

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetCanedit() bool`

GetCanedit returns the Canedit field if non-nil, zero value otherwise.

### GetCaneditOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetCaneditOk() (*bool, bool)`

GetCaneditOk returns a tuple with the Canedit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanedit

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetCanedit(v bool)`

SetCanedit sets Canedit field to given value.


### GetCategory

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetCategory() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetCategoryOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetCategory(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetCategoryid

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetComponent

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetCourse

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetCourse() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetCourseOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetCourse(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetDeleteurl

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetDeleteurl() string`

GetDeleteurl returns the Deleteurl field if non-nil, zero value otherwise.

### GetDeleteurlOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetDeleteurlOk() (*string, bool)`

GetDeleteurlOk returns a tuple with the Deleteurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleteurl

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetDeleteurl(v string)`

SetDeleteurl sets Deleteurl field to given value.


### GetDescription

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetEditurl

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetEditurl() string`

GetEditurl returns the Editurl field if non-nil, zero value otherwise.

### GetEditurlOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetEditurlOk() (*string, bool)`

GetEditurlOk returns a tuple with the Editurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditurl

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetEditurl(v string)`

SetEditurl sets Editurl field to given value.


### GetEventcount

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetEventcount() int32`

GetEventcount returns the Eventcount field if non-nil, zero value otherwise.

### GetEventcountOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetEventcountOk() (*int32, bool)`

GetEventcountOk returns a tuple with the Eventcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventcount

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetEventcount(v int32)`

SetEventcount sets Eventcount field to given value.

### HasEventcount

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasEventcount() bool`

HasEventcount returns a boolean if a field has been set.

### GetEventtype

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetEventtype() string`

GetEventtype returns the Eventtype field if non-nil, zero value otherwise.

### GetEventtypeOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetEventtypeOk() (*string, bool)`

GetEventtypeOk returns a tuple with the Eventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventtype

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetEventtype(v string)`

SetEventtype sets Eventtype field to given value.


### GetFormattedlocation

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetFormattedlocation() string`

GetFormattedlocation returns the Formattedlocation field if non-nil, zero value otherwise.

### GetFormattedlocationOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetFormattedlocationOk() (*string, bool)`

GetFormattedlocationOk returns a tuple with the Formattedlocation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedlocation

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetFormattedlocation(v string)`

SetFormattedlocation sets Formattedlocation field to given value.


### GetFormattedtime

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetFormattedtime() string`

GetFormattedtime returns the Formattedtime field if non-nil, zero value otherwise.

### GetFormattedtimeOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetFormattedtimeOk() (*string, bool)`

GetFormattedtimeOk returns a tuple with the Formattedtime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedtime

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetFormattedtime(v string)`

SetFormattedtime sets Formattedtime field to given value.


### GetGroupid

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetGroupname

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetGroupname() string`

GetGroupname returns the Groupname field if non-nil, zero value otherwise.

### GetGroupnameOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetGroupnameOk() (*string, bool)`

GetGroupnameOk returns a tuple with the Groupname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupname

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetGroupname(v string)`

SetGroupname sets Groupname field to given value.

### HasGroupname

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasGroupname() bool`

HasGroupname returns a boolean if a field has been set.

### GetIcon

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetIcon() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon`

GetIcon returns the Icon field if non-nil, zero value otherwise.

### GetIconOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetIconOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon, bool)`

GetIconOk returns a tuple with the Icon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIcon

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetIcon(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon)`

SetIcon sets Icon field to given value.


### GetId

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetId(v int32)`

SetId sets Id field to given value.


### GetInstance

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetInstance() int32`

GetInstance returns the Instance field if non-nil, zero value otherwise.

### GetInstanceOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetInstanceOk() (*int32, bool)`

GetInstanceOk returns a tuple with the Instance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstance

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetInstance(v int32)`

SetInstance sets Instance field to given value.

### HasInstance

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasInstance() bool`

HasInstance returns a boolean if a field has been set.

### GetIsactionevent

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetIsactionevent() bool`

GetIsactionevent returns the Isactionevent field if non-nil, zero value otherwise.

### GetIsactioneventOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetIsactioneventOk() (*bool, bool)`

GetIsactioneventOk returns a tuple with the Isactionevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsactionevent

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetIsactionevent(v bool)`

SetIsactionevent sets Isactionevent field to given value.


### GetIscategoryevent

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetIscategoryevent() bool`

GetIscategoryevent returns the Iscategoryevent field if non-nil, zero value otherwise.

### GetIscategoryeventOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetIscategoryeventOk() (*bool, bool)`

GetIscategoryeventOk returns a tuple with the Iscategoryevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscategoryevent

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetIscategoryevent(v bool)`

SetIscategoryevent sets Iscategoryevent field to given value.


### GetIscourseevent

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetIscourseevent() bool`

GetIscourseevent returns the Iscourseevent field if non-nil, zero value otherwise.

### GetIscourseeventOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetIscourseeventOk() (*bool, bool)`

GetIscourseeventOk returns a tuple with the Iscourseevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscourseevent

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetIscourseevent(v bool)`

SetIscourseevent sets Iscourseevent field to given value.


### GetLocation

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetLocation(v string)`

SetLocation sets Location field to given value.

### HasLocation

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasLocation() bool`

HasLocation returns a boolean if a field has been set.

### GetModulename

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetModulename() string`

GetModulename returns the Modulename field if non-nil, zero value otherwise.

### GetModulenameOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetModulenameOk() (*string, bool)`

GetModulenameOk returns a tuple with the Modulename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModulename

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetModulename(v string)`

SetModulename sets Modulename field to given value.

### HasModulename

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasModulename() bool`

HasModulename returns a boolean if a field has been set.

### GetName

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetName(v string)`

SetName sets Name field to given value.


### GetNormalisedeventtype

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetNormalisedeventtype() string`

GetNormalisedeventtype returns the Normalisedeventtype field if non-nil, zero value otherwise.

### GetNormalisedeventtypeOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetNormalisedeventtypeOk() (*string, bool)`

GetNormalisedeventtypeOk returns a tuple with the Normalisedeventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNormalisedeventtype

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetNormalisedeventtype(v string)`

SetNormalisedeventtype sets Normalisedeventtype field to given value.


### GetNormalisedeventtypetext

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetNormalisedeventtypetext() string`

GetNormalisedeventtypetext returns the Normalisedeventtypetext field if non-nil, zero value otherwise.

### GetNormalisedeventtypetextOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetNormalisedeventtypetextOk() (*string, bool)`

GetNormalisedeventtypetextOk returns a tuple with the Normalisedeventtypetext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNormalisedeventtypetext

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetNormalisedeventtypetext(v string)`

SetNormalisedeventtypetext sets Normalisedeventtypetext field to given value.


### GetOverdue

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetOverdue() bool`

GetOverdue returns the Overdue field if non-nil, zero value otherwise.

### GetOverdueOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetOverdueOk() (*bool, bool)`

GetOverdueOk returns a tuple with the Overdue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverdue

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetOverdue(v bool)`

SetOverdue sets Overdue field to given value.

### HasOverdue

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasOverdue() bool`

HasOverdue returns a boolean if a field has been set.

### GetPurpose

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.


### GetRepeatid

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetRepeatid() int32`

GetRepeatid returns the Repeatid field if non-nil, zero value otherwise.

### GetRepeatidOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetRepeatidOk() (*int32, bool)`

GetRepeatidOk returns a tuple with the Repeatid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepeatid

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetRepeatid(v int32)`

SetRepeatid sets Repeatid field to given value.

### HasRepeatid

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasRepeatid() bool`

HasRepeatid returns a boolean if a field has been set.

### GetSubscription

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetSubscription() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription`

GetSubscription returns the Subscription field if non-nil, zero value otherwise.

### GetSubscriptionOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetSubscriptionOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription, bool)`

GetSubscriptionOk returns a tuple with the Subscription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscription

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetSubscription(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription)`

SetSubscription sets Subscription field to given value.

### HasSubscription

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasSubscription() bool`

HasSubscription returns a boolean if a field has been set.

### GetTimeduration

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetTimeduration() int32`

GetTimeduration returns the Timeduration field if non-nil, zero value otherwise.

### GetTimedurationOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetTimedurationOk() (*int32, bool)`

GetTimedurationOk returns a tuple with the Timeduration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeduration

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetTimeduration(v int32)`

SetTimeduration sets Timeduration field to given value.


### GetTimemodified

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.


### GetTimesort

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetTimesort() int32`

GetTimesort returns the Timesort field if non-nil, zero value otherwise.

### GetTimesortOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetTimesortOk() (*int32, bool)`

GetTimesortOk returns a tuple with the Timesort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimesort

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetTimesort(v int32)`

SetTimesort sets Timesort field to given value.


### GetTimestart

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.


### GetTimeusermidnight

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetTimeusermidnight() int32`

GetTimeusermidnight returns the Timeusermidnight field if non-nil, zero value otherwise.

### GetTimeusermidnightOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetTimeusermidnightOk() (*int32, bool)`

GetTimeusermidnightOk returns a tuple with the Timeusermidnight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeusermidnight

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetTimeusermidnight(v int32)`

SetTimeusermidnight sets Timeusermidnight field to given value.


### GetUrl

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetUrl(v string)`

SetUrl sets Url field to given value.


### GetUserid

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetViewurl

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetViewurl() string`

GetViewurl returns the Viewurl field if non-nil, zero value otherwise.

### GetViewurlOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetViewurlOk() (*string, bool)`

GetViewurlOk returns a tuple with the Viewurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewurl

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetViewurl(v string)`

SetViewurl sets Viewurl field to given value.


### GetVisible

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCalendarGetCalendarEventById200ResponseEvent) SetVisible(v int32)`

SetVisible sets Visible field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


