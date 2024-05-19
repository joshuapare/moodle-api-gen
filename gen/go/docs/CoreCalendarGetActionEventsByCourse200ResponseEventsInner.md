# CoreCalendarGetActionEventsByCourse200ResponseEventsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | Pointer to [**CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction**](CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction.md) |  | [optional] 
**Activityname** | Pointer to **string** | activityname | [optional] [default to "null"]
**Activitystr** | Pointer to **string** | activitystr | [optional] [default to "null"]
**Candelete** | Pointer to **bool** | candelete | [optional] [default to null]
**Canedit** | Pointer to **bool** | canedit | [optional] [default to null]
**Category** | Pointer to [**CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory**](CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory.md) |  | [optional] 
**Categoryid** | Pointer to **int32** | categoryid | [optional] [default to null]
**Component** | Pointer to **string** | component | [optional] [default to "null"]
**Course** | Pointer to [**CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse**](CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse.md) |  | [optional] 
**Deleteurl** | Pointer to **string** | deleteurl | [optional] [default to "null"]
**Description** | Pointer to **string** | description | [optional] [default to "null"]
**Descriptionformat** | Pointer to **int32** | description format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 1]
**Editurl** | Pointer to **string** | editurl | [optional] [default to "null"]
**Eventcount** | Pointer to **int32** | eventcount | [optional] [default to null]
**Eventtype** | Pointer to **string** | eventtype | [optional] [default to "null"]
**Formattedlocation** | Pointer to **string** | formattedlocation | [optional] [default to "null"]
**Formattedtime** | Pointer to **string** | formattedtime | [optional] [default to "null"]
**Groupid** | Pointer to **int32** | groupid | [optional] [default to null]
**Groupname** | Pointer to **string** | groupname | [optional] [default to "null"]
**Icon** | Pointer to [**CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon**](CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.md) |  | [optional] 
**Id** | Pointer to **int32** | id | [optional] 
**Instance** | Pointer to **int32** | instance | [optional] [default to null]
**Isactionevent** | Pointer to **bool** | isactionevent | [optional] [default to null]
**Iscategoryevent** | Pointer to **bool** | iscategoryevent | [optional] [default to null]
**Iscourseevent** | Pointer to **bool** | iscourseevent | [optional] [default to null]
**Location** | Pointer to **string** | location | [optional] [default to "null"]
**Modulename** | Pointer to **string** | modulename | [optional] [default to "null"]
**Name** | Pointer to **string** | name | [optional] 
**Normalisedeventtype** | Pointer to **string** | normalisedeventtype | [optional] [default to "null"]
**Normalisedeventtypetext** | Pointer to **string** | normalisedeventtypetext | [optional] [default to "null"]
**Overdue** | Pointer to **bool** | overdue | [optional] [default to false]
**Purpose** | Pointer to **string** | purpose | [optional] [default to "null"]
**Repeatid** | Pointer to **int32** | repeatid | [optional] [default to null]
**Subscription** | Pointer to [**CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription**](CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription.md) |  | [optional] 
**Timeduration** | Pointer to **int32** | timeduration | [optional] [default to null]
**Timemodified** | Pointer to **int32** | timemodified | [optional] [default to null]
**Timesort** | Pointer to **int32** | timesort | [optional] [default to null]
**Timestart** | Pointer to **int32** | timestart | [optional] [default to null]
**Timeusermidnight** | Pointer to **int32** | timeusermidnight | [optional] [default to null]
**Url** | Pointer to **string** | url | [optional] 
**Userid** | Pointer to **int32** | userid | [optional] [default to null]
**Viewurl** | Pointer to **string** | viewurl | [optional] 
**Visible** | Pointer to **int32** | visible | [optional] [default to null]

## Methods

### NewCoreCalendarGetActionEventsByCourse200ResponseEventsInner

`func NewCoreCalendarGetActionEventsByCourse200ResponseEventsInner() *CoreCalendarGetActionEventsByCourse200ResponseEventsInner`

NewCoreCalendarGetActionEventsByCourse200ResponseEventsInner instantiates a new CoreCalendarGetActionEventsByCourse200ResponseEventsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetActionEventsByCourse200ResponseEventsInnerWithDefaults

`func NewCoreCalendarGetActionEventsByCourse200ResponseEventsInnerWithDefaults() *CoreCalendarGetActionEventsByCourse200ResponseEventsInner`

NewCoreCalendarGetActionEventsByCourse200ResponseEventsInnerWithDefaults instantiates a new CoreCalendarGetActionEventsByCourse200ResponseEventsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetAction() CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetActionOk() (*CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetAction(v CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction)`

SetAction sets Action field to given value.

### HasAction

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasAction() bool`

HasAction returns a boolean if a field has been set.

### GetActivityname

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetActivityname() string`

GetActivityname returns the Activityname field if non-nil, zero value otherwise.

### GetActivitynameOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetActivitynameOk() (*string, bool)`

GetActivitynameOk returns a tuple with the Activityname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityname

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetActivityname(v string)`

SetActivityname sets Activityname field to given value.

### HasActivityname

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasActivityname() bool`

HasActivityname returns a boolean if a field has been set.

### GetActivitystr

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetActivitystr() string`

GetActivitystr returns the Activitystr field if non-nil, zero value otherwise.

### GetActivitystrOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetActivitystrOk() (*string, bool)`

GetActivitystrOk returns a tuple with the Activitystr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivitystr

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetActivitystr(v string)`

SetActivitystr sets Activitystr field to given value.

### HasActivitystr

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasActivitystr() bool`

HasActivitystr returns a boolean if a field has been set.

### GetCandelete

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetCandelete() bool`

GetCandelete returns the Candelete field if non-nil, zero value otherwise.

### GetCandeleteOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetCandeleteOk() (*bool, bool)`

GetCandeleteOk returns a tuple with the Candelete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandelete

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetCandelete(v bool)`

SetCandelete sets Candelete field to given value.

### HasCandelete

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasCandelete() bool`

HasCandelete returns a boolean if a field has been set.

### GetCanedit

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetCanedit() bool`

GetCanedit returns the Canedit field if non-nil, zero value otherwise.

### GetCaneditOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetCaneditOk() (*bool, bool)`

GetCaneditOk returns a tuple with the Canedit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanedit

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetCanedit(v bool)`

SetCanedit sets Canedit field to given value.

### HasCanedit

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasCanedit() bool`

HasCanedit returns a boolean if a field has been set.

### GetCategory

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetCategory() CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetCategoryOk() (*CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetCategory(v CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetCategoryid

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetComponent

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetCourse

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetCourse() CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetCourseOk() (*CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetCourse(v CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetDeleteurl

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetDeleteurl() string`

GetDeleteurl returns the Deleteurl field if non-nil, zero value otherwise.

### GetDeleteurlOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetDeleteurlOk() (*string, bool)`

GetDeleteurlOk returns a tuple with the Deleteurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleteurl

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetDeleteurl(v string)`

SetDeleteurl sets Deleteurl field to given value.

### HasDeleteurl

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasDeleteurl() bool`

HasDeleteurl returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetEditurl

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetEditurl() string`

GetEditurl returns the Editurl field if non-nil, zero value otherwise.

### GetEditurlOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetEditurlOk() (*string, bool)`

GetEditurlOk returns a tuple with the Editurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditurl

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetEditurl(v string)`

SetEditurl sets Editurl field to given value.

### HasEditurl

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasEditurl() bool`

HasEditurl returns a boolean if a field has been set.

### GetEventcount

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetEventcount() int32`

GetEventcount returns the Eventcount field if non-nil, zero value otherwise.

### GetEventcountOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetEventcountOk() (*int32, bool)`

GetEventcountOk returns a tuple with the Eventcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventcount

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetEventcount(v int32)`

SetEventcount sets Eventcount field to given value.

### HasEventcount

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasEventcount() bool`

HasEventcount returns a boolean if a field has been set.

### GetEventtype

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetEventtype() string`

GetEventtype returns the Eventtype field if non-nil, zero value otherwise.

### GetEventtypeOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetEventtypeOk() (*string, bool)`

GetEventtypeOk returns a tuple with the Eventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventtype

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetEventtype(v string)`

SetEventtype sets Eventtype field to given value.

### HasEventtype

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasEventtype() bool`

HasEventtype returns a boolean if a field has been set.

### GetFormattedlocation

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetFormattedlocation() string`

GetFormattedlocation returns the Formattedlocation field if non-nil, zero value otherwise.

### GetFormattedlocationOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetFormattedlocationOk() (*string, bool)`

GetFormattedlocationOk returns a tuple with the Formattedlocation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedlocation

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetFormattedlocation(v string)`

SetFormattedlocation sets Formattedlocation field to given value.

### HasFormattedlocation

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasFormattedlocation() bool`

HasFormattedlocation returns a boolean if a field has been set.

### GetFormattedtime

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetFormattedtime() string`

GetFormattedtime returns the Formattedtime field if non-nil, zero value otherwise.

### GetFormattedtimeOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetFormattedtimeOk() (*string, bool)`

GetFormattedtimeOk returns a tuple with the Formattedtime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedtime

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetFormattedtime(v string)`

SetFormattedtime sets Formattedtime field to given value.

### HasFormattedtime

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasFormattedtime() bool`

HasFormattedtime returns a boolean if a field has been set.

### GetGroupid

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetGroupname

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetGroupname() string`

GetGroupname returns the Groupname field if non-nil, zero value otherwise.

### GetGroupnameOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetGroupnameOk() (*string, bool)`

GetGroupnameOk returns a tuple with the Groupname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupname

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetGroupname(v string)`

SetGroupname sets Groupname field to given value.

### HasGroupname

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasGroupname() bool`

HasGroupname returns a boolean if a field has been set.

### GetIcon

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetIcon() CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon`

GetIcon returns the Icon field if non-nil, zero value otherwise.

### GetIconOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetIconOk() (*CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon, bool)`

GetIconOk returns a tuple with the Icon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIcon

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetIcon(v CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon)`

SetIcon sets Icon field to given value.

### HasIcon

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasIcon() bool`

HasIcon returns a boolean if a field has been set.

### GetId

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInstance

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetInstance() int32`

GetInstance returns the Instance field if non-nil, zero value otherwise.

### GetInstanceOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetInstanceOk() (*int32, bool)`

GetInstanceOk returns a tuple with the Instance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstance

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetInstance(v int32)`

SetInstance sets Instance field to given value.

### HasInstance

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasInstance() bool`

HasInstance returns a boolean if a field has been set.

### GetIsactionevent

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetIsactionevent() bool`

GetIsactionevent returns the Isactionevent field if non-nil, zero value otherwise.

### GetIsactioneventOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetIsactioneventOk() (*bool, bool)`

GetIsactioneventOk returns a tuple with the Isactionevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsactionevent

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetIsactionevent(v bool)`

SetIsactionevent sets Isactionevent field to given value.

### HasIsactionevent

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasIsactionevent() bool`

HasIsactionevent returns a boolean if a field has been set.

### GetIscategoryevent

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetIscategoryevent() bool`

GetIscategoryevent returns the Iscategoryevent field if non-nil, zero value otherwise.

### GetIscategoryeventOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetIscategoryeventOk() (*bool, bool)`

GetIscategoryeventOk returns a tuple with the Iscategoryevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscategoryevent

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetIscategoryevent(v bool)`

SetIscategoryevent sets Iscategoryevent field to given value.

### HasIscategoryevent

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasIscategoryevent() bool`

HasIscategoryevent returns a boolean if a field has been set.

### GetIscourseevent

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetIscourseevent() bool`

GetIscourseevent returns the Iscourseevent field if non-nil, zero value otherwise.

### GetIscourseeventOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetIscourseeventOk() (*bool, bool)`

GetIscourseeventOk returns a tuple with the Iscourseevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscourseevent

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetIscourseevent(v bool)`

SetIscourseevent sets Iscourseevent field to given value.

### HasIscourseevent

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasIscourseevent() bool`

HasIscourseevent returns a boolean if a field has been set.

### GetLocation

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetLocation(v string)`

SetLocation sets Location field to given value.

### HasLocation

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasLocation() bool`

HasLocation returns a boolean if a field has been set.

### GetModulename

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetModulename() string`

GetModulename returns the Modulename field if non-nil, zero value otherwise.

### GetModulenameOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetModulenameOk() (*string, bool)`

GetModulenameOk returns a tuple with the Modulename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModulename

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetModulename(v string)`

SetModulename sets Modulename field to given value.

### HasModulename

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasModulename() bool`

HasModulename returns a boolean if a field has been set.

### GetName

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNormalisedeventtype

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetNormalisedeventtype() string`

GetNormalisedeventtype returns the Normalisedeventtype field if non-nil, zero value otherwise.

### GetNormalisedeventtypeOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetNormalisedeventtypeOk() (*string, bool)`

GetNormalisedeventtypeOk returns a tuple with the Normalisedeventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNormalisedeventtype

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetNormalisedeventtype(v string)`

SetNormalisedeventtype sets Normalisedeventtype field to given value.

### HasNormalisedeventtype

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasNormalisedeventtype() bool`

HasNormalisedeventtype returns a boolean if a field has been set.

### GetNormalisedeventtypetext

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetNormalisedeventtypetext() string`

GetNormalisedeventtypetext returns the Normalisedeventtypetext field if non-nil, zero value otherwise.

### GetNormalisedeventtypetextOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetNormalisedeventtypetextOk() (*string, bool)`

GetNormalisedeventtypetextOk returns a tuple with the Normalisedeventtypetext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNormalisedeventtypetext

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetNormalisedeventtypetext(v string)`

SetNormalisedeventtypetext sets Normalisedeventtypetext field to given value.

### HasNormalisedeventtypetext

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasNormalisedeventtypetext() bool`

HasNormalisedeventtypetext returns a boolean if a field has been set.

### GetOverdue

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetOverdue() bool`

GetOverdue returns the Overdue field if non-nil, zero value otherwise.

### GetOverdueOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetOverdueOk() (*bool, bool)`

GetOverdueOk returns a tuple with the Overdue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverdue

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetOverdue(v bool)`

SetOverdue sets Overdue field to given value.

### HasOverdue

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasOverdue() bool`

HasOverdue returns a boolean if a field has been set.

### GetPurpose

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.

### HasPurpose

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasPurpose() bool`

HasPurpose returns a boolean if a field has been set.

### GetRepeatid

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetRepeatid() int32`

GetRepeatid returns the Repeatid field if non-nil, zero value otherwise.

### GetRepeatidOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetRepeatidOk() (*int32, bool)`

GetRepeatidOk returns a tuple with the Repeatid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepeatid

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetRepeatid(v int32)`

SetRepeatid sets Repeatid field to given value.

### HasRepeatid

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasRepeatid() bool`

HasRepeatid returns a boolean if a field has been set.

### GetSubscription

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetSubscription() CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription`

GetSubscription returns the Subscription field if non-nil, zero value otherwise.

### GetSubscriptionOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetSubscriptionOk() (*CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription, bool)`

GetSubscriptionOk returns a tuple with the Subscription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscription

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetSubscription(v CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription)`

SetSubscription sets Subscription field to given value.

### HasSubscription

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasSubscription() bool`

HasSubscription returns a boolean if a field has been set.

### GetTimeduration

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetTimeduration() int32`

GetTimeduration returns the Timeduration field if non-nil, zero value otherwise.

### GetTimedurationOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetTimedurationOk() (*int32, bool)`

GetTimedurationOk returns a tuple with the Timeduration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeduration

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetTimeduration(v int32)`

SetTimeduration sets Timeduration field to given value.

### HasTimeduration

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasTimeduration() bool`

HasTimeduration returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimesort

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetTimesort() int32`

GetTimesort returns the Timesort field if non-nil, zero value otherwise.

### GetTimesortOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetTimesortOk() (*int32, bool)`

GetTimesortOk returns a tuple with the Timesort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimesort

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetTimesort(v int32)`

SetTimesort sets Timesort field to given value.

### HasTimesort

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasTimesort() bool`

HasTimesort returns a boolean if a field has been set.

### GetTimestart

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetTimeusermidnight

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetTimeusermidnight() int32`

GetTimeusermidnight returns the Timeusermidnight field if non-nil, zero value otherwise.

### GetTimeusermidnightOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetTimeusermidnightOk() (*int32, bool)`

GetTimeusermidnightOk returns a tuple with the Timeusermidnight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeusermidnight

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetTimeusermidnight(v int32)`

SetTimeusermidnight sets Timeusermidnight field to given value.

### HasTimeusermidnight

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasTimeusermidnight() bool`

HasTimeusermidnight returns a boolean if a field has been set.

### GetUrl

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetViewurl

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetViewurl() string`

GetViewurl returns the Viewurl field if non-nil, zero value otherwise.

### GetViewurlOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetViewurlOk() (*string, bool)`

GetViewurlOk returns a tuple with the Viewurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewurl

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetViewurl(v string)`

SetViewurl sets Viewurl field to given value.

### HasViewurl

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasViewurl() bool`

HasViewurl returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCalendarGetActionEventsByCourse200ResponseEventsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


