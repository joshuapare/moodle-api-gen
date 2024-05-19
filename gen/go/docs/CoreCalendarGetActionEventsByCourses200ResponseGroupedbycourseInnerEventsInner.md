# CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | Pointer to [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction.md) |  | [optional] 
**Activityname** | Pointer to **string** | activityname | [optional] 
**Activitystr** | Pointer to **string** | activitystr | [optional] 
**Candelete** | Pointer to **bool** | candelete | [optional] 
**Canedit** | Pointer to **bool** | canedit | [optional] 
**Category** | Pointer to [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory.md) |  | [optional] 
**Categoryid** | Pointer to **int32** | categoryid | [optional] 
**Component** | Pointer to **string** | component | [optional] 
**Course** | Pointer to [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse.md) |  | [optional] 
**Deleteurl** | Pointer to **string** | deleteurl | [optional] 
**Description** | Pointer to **string** | description | [optional] 
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Editurl** | Pointer to **string** | editurl | [optional] 
**Eventcount** | Pointer to **int32** | eventcount | [optional] 
**Eventtype** | Pointer to **string** | eventtype | [optional] 
**Formattedlocation** | Pointer to **string** | formattedlocation | [optional] 
**Formattedtime** | Pointer to **string** | formattedtime | [optional] 
**Groupid** | Pointer to **int32** | groupid | [optional] 
**Groupname** | Pointer to **string** | groupname | [optional] 
**Icon** | Pointer to [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon.md) |  | [optional] 
**Id** | Pointer to **int32** | id | [optional] 
**Instance** | Pointer to **int32** | instance | [optional] 
**Isactionevent** | Pointer to **bool** | isactionevent | [optional] 
**Iscategoryevent** | Pointer to **bool** | iscategoryevent | [optional] 
**Iscourseevent** | Pointer to **bool** | iscourseevent | [optional] 
**Location** | Pointer to **string** | location | [optional] 
**Modulename** | Pointer to **string** | modulename | [optional] 
**Name** | Pointer to **string** | name | [optional] 
**Normalisedeventtype** | Pointer to **string** | normalisedeventtype | [optional] 
**Normalisedeventtypetext** | Pointer to **string** | normalisedeventtypetext | [optional] 
**Overdue** | Pointer to **bool** | overdue | [optional] [default to false]
**Purpose** | Pointer to **string** | purpose | [optional] 
**Repeatid** | Pointer to **int32** | repeatid | [optional] 
**Subscription** | Pointer to [**CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription**](CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.md) |  | [optional] 
**Timeduration** | Pointer to **int32** | timeduration | [optional] 
**Timemodified** | Pointer to **int32** | timemodified | [optional] 
**Timesort** | Pointer to **int32** | timesort | [optional] 
**Timestart** | Pointer to **int32** | timestart | [optional] 
**Timeusermidnight** | Pointer to **int32** | timeusermidnight | [optional] 
**Url** | Pointer to **string** | url | [optional] 
**Userid** | Pointer to **int32** | userid | [optional] 
**Viewurl** | Pointer to **string** | viewurl | [optional] 
**Visible** | Pointer to **int32** | visible | [optional] 

## Methods

### NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner

`func NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner() *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner`

NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner instantiates a new CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerWithDefaults

`func NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerWithDefaults() *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner`

NewCoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerWithDefaults instantiates a new CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetAction() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetActionOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetAction(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction)`

SetAction sets Action field to given value.

### HasAction

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasAction() bool`

HasAction returns a boolean if a field has been set.

### GetActivityname

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetActivityname() string`

GetActivityname returns the Activityname field if non-nil, zero value otherwise.

### GetActivitynameOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetActivitynameOk() (*string, bool)`

GetActivitynameOk returns a tuple with the Activityname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityname

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetActivityname(v string)`

SetActivityname sets Activityname field to given value.

### HasActivityname

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasActivityname() bool`

HasActivityname returns a boolean if a field has been set.

### GetActivitystr

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetActivitystr() string`

GetActivitystr returns the Activitystr field if non-nil, zero value otherwise.

### GetActivitystrOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetActivitystrOk() (*string, bool)`

GetActivitystrOk returns a tuple with the Activitystr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivitystr

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetActivitystr(v string)`

SetActivitystr sets Activitystr field to given value.

### HasActivitystr

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasActivitystr() bool`

HasActivitystr returns a boolean if a field has been set.

### GetCandelete

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetCandelete() bool`

GetCandelete returns the Candelete field if non-nil, zero value otherwise.

### GetCandeleteOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetCandeleteOk() (*bool, bool)`

GetCandeleteOk returns a tuple with the Candelete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandelete

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetCandelete(v bool)`

SetCandelete sets Candelete field to given value.

### HasCandelete

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasCandelete() bool`

HasCandelete returns a boolean if a field has been set.

### GetCanedit

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetCanedit() bool`

GetCanedit returns the Canedit field if non-nil, zero value otherwise.

### GetCaneditOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetCaneditOk() (*bool, bool)`

GetCaneditOk returns a tuple with the Canedit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanedit

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetCanedit(v bool)`

SetCanedit sets Canedit field to given value.

### HasCanedit

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasCanedit() bool`

HasCanedit returns a boolean if a field has been set.

### GetCategory

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetCategory() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetCategoryOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetCategory(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetCategoryid

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetComponent

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetCourse

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetCourse() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetCourseOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetCourse(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetDeleteurl

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetDeleteurl() string`

GetDeleteurl returns the Deleteurl field if non-nil, zero value otherwise.

### GetDeleteurlOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetDeleteurlOk() (*string, bool)`

GetDeleteurlOk returns a tuple with the Deleteurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleteurl

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetDeleteurl(v string)`

SetDeleteurl sets Deleteurl field to given value.

### HasDeleteurl

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasDeleteurl() bool`

HasDeleteurl returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetEditurl

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetEditurl() string`

GetEditurl returns the Editurl field if non-nil, zero value otherwise.

### GetEditurlOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetEditurlOk() (*string, bool)`

GetEditurlOk returns a tuple with the Editurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditurl

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetEditurl(v string)`

SetEditurl sets Editurl field to given value.

### HasEditurl

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasEditurl() bool`

HasEditurl returns a boolean if a field has been set.

### GetEventcount

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetEventcount() int32`

GetEventcount returns the Eventcount field if non-nil, zero value otherwise.

### GetEventcountOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetEventcountOk() (*int32, bool)`

GetEventcountOk returns a tuple with the Eventcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventcount

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetEventcount(v int32)`

SetEventcount sets Eventcount field to given value.

### HasEventcount

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasEventcount() bool`

HasEventcount returns a boolean if a field has been set.

### GetEventtype

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetEventtype() string`

GetEventtype returns the Eventtype field if non-nil, zero value otherwise.

### GetEventtypeOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetEventtypeOk() (*string, bool)`

GetEventtypeOk returns a tuple with the Eventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventtype

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetEventtype(v string)`

SetEventtype sets Eventtype field to given value.

### HasEventtype

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasEventtype() bool`

HasEventtype returns a boolean if a field has been set.

### GetFormattedlocation

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetFormattedlocation() string`

GetFormattedlocation returns the Formattedlocation field if non-nil, zero value otherwise.

### GetFormattedlocationOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetFormattedlocationOk() (*string, bool)`

GetFormattedlocationOk returns a tuple with the Formattedlocation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedlocation

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetFormattedlocation(v string)`

SetFormattedlocation sets Formattedlocation field to given value.

### HasFormattedlocation

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasFormattedlocation() bool`

HasFormattedlocation returns a boolean if a field has been set.

### GetFormattedtime

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetFormattedtime() string`

GetFormattedtime returns the Formattedtime field if non-nil, zero value otherwise.

### GetFormattedtimeOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetFormattedtimeOk() (*string, bool)`

GetFormattedtimeOk returns a tuple with the Formattedtime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedtime

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetFormattedtime(v string)`

SetFormattedtime sets Formattedtime field to given value.

### HasFormattedtime

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasFormattedtime() bool`

HasFormattedtime returns a boolean if a field has been set.

### GetGroupid

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetGroupname

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetGroupname() string`

GetGroupname returns the Groupname field if non-nil, zero value otherwise.

### GetGroupnameOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetGroupnameOk() (*string, bool)`

GetGroupnameOk returns a tuple with the Groupname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupname

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetGroupname(v string)`

SetGroupname sets Groupname field to given value.

### HasGroupname

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasGroupname() bool`

HasGroupname returns a boolean if a field has been set.

### GetIcon

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetIcon() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon`

GetIcon returns the Icon field if non-nil, zero value otherwise.

### GetIconOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetIconOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon, bool)`

GetIconOk returns a tuple with the Icon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIcon

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetIcon(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon)`

SetIcon sets Icon field to given value.

### HasIcon

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasIcon() bool`

HasIcon returns a boolean if a field has been set.

### GetId

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInstance

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetInstance() int32`

GetInstance returns the Instance field if non-nil, zero value otherwise.

### GetInstanceOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetInstanceOk() (*int32, bool)`

GetInstanceOk returns a tuple with the Instance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstance

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetInstance(v int32)`

SetInstance sets Instance field to given value.

### HasInstance

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasInstance() bool`

HasInstance returns a boolean if a field has been set.

### GetIsactionevent

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetIsactionevent() bool`

GetIsactionevent returns the Isactionevent field if non-nil, zero value otherwise.

### GetIsactioneventOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetIsactioneventOk() (*bool, bool)`

GetIsactioneventOk returns a tuple with the Isactionevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsactionevent

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetIsactionevent(v bool)`

SetIsactionevent sets Isactionevent field to given value.

### HasIsactionevent

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasIsactionevent() bool`

HasIsactionevent returns a boolean if a field has been set.

### GetIscategoryevent

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetIscategoryevent() bool`

GetIscategoryevent returns the Iscategoryevent field if non-nil, zero value otherwise.

### GetIscategoryeventOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetIscategoryeventOk() (*bool, bool)`

GetIscategoryeventOk returns a tuple with the Iscategoryevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscategoryevent

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetIscategoryevent(v bool)`

SetIscategoryevent sets Iscategoryevent field to given value.

### HasIscategoryevent

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasIscategoryevent() bool`

HasIscategoryevent returns a boolean if a field has been set.

### GetIscourseevent

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetIscourseevent() bool`

GetIscourseevent returns the Iscourseevent field if non-nil, zero value otherwise.

### GetIscourseeventOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetIscourseeventOk() (*bool, bool)`

GetIscourseeventOk returns a tuple with the Iscourseevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscourseevent

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetIscourseevent(v bool)`

SetIscourseevent sets Iscourseevent field to given value.

### HasIscourseevent

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasIscourseevent() bool`

HasIscourseevent returns a boolean if a field has been set.

### GetLocation

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetLocation(v string)`

SetLocation sets Location field to given value.

### HasLocation

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasLocation() bool`

HasLocation returns a boolean if a field has been set.

### GetModulename

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetModulename() string`

GetModulename returns the Modulename field if non-nil, zero value otherwise.

### GetModulenameOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetModulenameOk() (*string, bool)`

GetModulenameOk returns a tuple with the Modulename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModulename

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetModulename(v string)`

SetModulename sets Modulename field to given value.

### HasModulename

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasModulename() bool`

HasModulename returns a boolean if a field has been set.

### GetName

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNormalisedeventtype

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetNormalisedeventtype() string`

GetNormalisedeventtype returns the Normalisedeventtype field if non-nil, zero value otherwise.

### GetNormalisedeventtypeOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetNormalisedeventtypeOk() (*string, bool)`

GetNormalisedeventtypeOk returns a tuple with the Normalisedeventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNormalisedeventtype

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetNormalisedeventtype(v string)`

SetNormalisedeventtype sets Normalisedeventtype field to given value.

### HasNormalisedeventtype

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasNormalisedeventtype() bool`

HasNormalisedeventtype returns a boolean if a field has been set.

### GetNormalisedeventtypetext

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetNormalisedeventtypetext() string`

GetNormalisedeventtypetext returns the Normalisedeventtypetext field if non-nil, zero value otherwise.

### GetNormalisedeventtypetextOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetNormalisedeventtypetextOk() (*string, bool)`

GetNormalisedeventtypetextOk returns a tuple with the Normalisedeventtypetext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNormalisedeventtypetext

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetNormalisedeventtypetext(v string)`

SetNormalisedeventtypetext sets Normalisedeventtypetext field to given value.

### HasNormalisedeventtypetext

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasNormalisedeventtypetext() bool`

HasNormalisedeventtypetext returns a boolean if a field has been set.

### GetOverdue

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetOverdue() bool`

GetOverdue returns the Overdue field if non-nil, zero value otherwise.

### GetOverdueOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetOverdueOk() (*bool, bool)`

GetOverdueOk returns a tuple with the Overdue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverdue

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetOverdue(v bool)`

SetOverdue sets Overdue field to given value.

### HasOverdue

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasOverdue() bool`

HasOverdue returns a boolean if a field has been set.

### GetPurpose

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.

### HasPurpose

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasPurpose() bool`

HasPurpose returns a boolean if a field has been set.

### GetRepeatid

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetRepeatid() int32`

GetRepeatid returns the Repeatid field if non-nil, zero value otherwise.

### GetRepeatidOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetRepeatidOk() (*int32, bool)`

GetRepeatidOk returns a tuple with the Repeatid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepeatid

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetRepeatid(v int32)`

SetRepeatid sets Repeatid field to given value.

### HasRepeatid

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasRepeatid() bool`

HasRepeatid returns a boolean if a field has been set.

### GetSubscription

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetSubscription() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription`

GetSubscription returns the Subscription field if non-nil, zero value otherwise.

### GetSubscriptionOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetSubscriptionOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription, bool)`

GetSubscriptionOk returns a tuple with the Subscription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscription

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetSubscription(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription)`

SetSubscription sets Subscription field to given value.

### HasSubscription

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasSubscription() bool`

HasSubscription returns a boolean if a field has been set.

### GetTimeduration

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetTimeduration() int32`

GetTimeduration returns the Timeduration field if non-nil, zero value otherwise.

### GetTimedurationOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetTimedurationOk() (*int32, bool)`

GetTimedurationOk returns a tuple with the Timeduration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeduration

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetTimeduration(v int32)`

SetTimeduration sets Timeduration field to given value.

### HasTimeduration

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasTimeduration() bool`

HasTimeduration returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimesort

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetTimesort() int32`

GetTimesort returns the Timesort field if non-nil, zero value otherwise.

### GetTimesortOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetTimesortOk() (*int32, bool)`

GetTimesortOk returns a tuple with the Timesort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimesort

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetTimesort(v int32)`

SetTimesort sets Timesort field to given value.

### HasTimesort

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasTimesort() bool`

HasTimesort returns a boolean if a field has been set.

### GetTimestart

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetTimeusermidnight

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetTimeusermidnight() int32`

GetTimeusermidnight returns the Timeusermidnight field if non-nil, zero value otherwise.

### GetTimeusermidnightOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetTimeusermidnightOk() (*int32, bool)`

GetTimeusermidnightOk returns a tuple with the Timeusermidnight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeusermidnight

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetTimeusermidnight(v int32)`

SetTimeusermidnight sets Timeusermidnight field to given value.

### HasTimeusermidnight

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasTimeusermidnight() bool`

HasTimeusermidnight returns a boolean if a field has been set.

### GetUrl

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetViewurl

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetViewurl() string`

GetViewurl returns the Viewurl field if non-nil, zero value otherwise.

### GetViewurlOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetViewurlOk() (*string, bool)`

GetViewurlOk returns a tuple with the Viewurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewurl

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetViewurl(v string)`

SetViewurl sets Viewurl field to given value.

### HasViewurl

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasViewurl() bool`

HasViewurl returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


