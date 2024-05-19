# CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner

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
**Draggable** | Pointer to **bool** | draggable | [optional] [default to false]
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
**Islastday** | Pointer to **bool** | islastday | [optional] [default to false]
**Location** | Pointer to **string** | location | [optional] 
**Maxdayerror** | Pointer to **string** | maxdayerror | [optional] 
**Maxdaytimestamp** | Pointer to **int32** | maxdaytimestamp | [optional] 
**Mindayerror** | Pointer to **string** | mindayerror | [optional] 
**Mindaytimestamp** | Pointer to **int32** | mindaytimestamp | [optional] 
**Modulename** | Pointer to **string** | modulename | [optional] 
**Name** | Pointer to **string** | name | [optional] 
**Normalisedeventtype** | Pointer to **string** | normalisedeventtype | [optional] 
**Normalisedeventtypetext** | Pointer to **string** | normalisedeventtypetext | [optional] 
**Overdue** | Pointer to **bool** | overdue | [optional] [default to false]
**Popupname** | Pointer to **string** | popupname | [optional] 
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

### NewCoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner

`func NewCoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner() *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner`

NewCoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner instantiates a new CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInnerWithDefaults

`func NewCoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInnerWithDefaults() *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner`

NewCoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInnerWithDefaults instantiates a new CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetAction() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetActionOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetAction(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction)`

SetAction sets Action field to given value.

### HasAction

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasAction() bool`

HasAction returns a boolean if a field has been set.

### GetActivityname

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetActivityname() string`

GetActivityname returns the Activityname field if non-nil, zero value otherwise.

### GetActivitynameOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetActivitynameOk() (*string, bool)`

GetActivitynameOk returns a tuple with the Activityname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityname

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetActivityname(v string)`

SetActivityname sets Activityname field to given value.

### HasActivityname

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasActivityname() bool`

HasActivityname returns a boolean if a field has been set.

### GetActivitystr

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetActivitystr() string`

GetActivitystr returns the Activitystr field if non-nil, zero value otherwise.

### GetActivitystrOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetActivitystrOk() (*string, bool)`

GetActivitystrOk returns a tuple with the Activitystr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivitystr

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetActivitystr(v string)`

SetActivitystr sets Activitystr field to given value.

### HasActivitystr

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasActivitystr() bool`

HasActivitystr returns a boolean if a field has been set.

### GetCandelete

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetCandelete() bool`

GetCandelete returns the Candelete field if non-nil, zero value otherwise.

### GetCandeleteOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetCandeleteOk() (*bool, bool)`

GetCandeleteOk returns a tuple with the Candelete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandelete

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetCandelete(v bool)`

SetCandelete sets Candelete field to given value.

### HasCandelete

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasCandelete() bool`

HasCandelete returns a boolean if a field has been set.

### GetCanedit

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetCanedit() bool`

GetCanedit returns the Canedit field if non-nil, zero value otherwise.

### GetCaneditOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetCaneditOk() (*bool, bool)`

GetCaneditOk returns a tuple with the Canedit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanedit

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetCanedit(v bool)`

SetCanedit sets Canedit field to given value.

### HasCanedit

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasCanedit() bool`

HasCanedit returns a boolean if a field has been set.

### GetCategory

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetCategory() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetCategoryOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetCategory(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetCategoryid

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetComponent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetCourse

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetCourse() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetCourseOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetCourse(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetDeleteurl

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetDeleteurl() string`

GetDeleteurl returns the Deleteurl field if non-nil, zero value otherwise.

### GetDeleteurlOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetDeleteurlOk() (*string, bool)`

GetDeleteurlOk returns a tuple with the Deleteurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleteurl

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetDeleteurl(v string)`

SetDeleteurl sets Deleteurl field to given value.

### HasDeleteurl

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasDeleteurl() bool`

HasDeleteurl returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetDraggable

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetDraggable() bool`

GetDraggable returns the Draggable field if non-nil, zero value otherwise.

### GetDraggableOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetDraggableOk() (*bool, bool)`

GetDraggableOk returns a tuple with the Draggable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDraggable

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetDraggable(v bool)`

SetDraggable sets Draggable field to given value.

### HasDraggable

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasDraggable() bool`

HasDraggable returns a boolean if a field has been set.

### GetEditurl

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetEditurl() string`

GetEditurl returns the Editurl field if non-nil, zero value otherwise.

### GetEditurlOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetEditurlOk() (*string, bool)`

GetEditurlOk returns a tuple with the Editurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditurl

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetEditurl(v string)`

SetEditurl sets Editurl field to given value.

### HasEditurl

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasEditurl() bool`

HasEditurl returns a boolean if a field has been set.

### GetEventcount

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetEventcount() int32`

GetEventcount returns the Eventcount field if non-nil, zero value otherwise.

### GetEventcountOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetEventcountOk() (*int32, bool)`

GetEventcountOk returns a tuple with the Eventcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventcount

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetEventcount(v int32)`

SetEventcount sets Eventcount field to given value.

### HasEventcount

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasEventcount() bool`

HasEventcount returns a boolean if a field has been set.

### GetEventtype

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetEventtype() string`

GetEventtype returns the Eventtype field if non-nil, zero value otherwise.

### GetEventtypeOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetEventtypeOk() (*string, bool)`

GetEventtypeOk returns a tuple with the Eventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventtype

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetEventtype(v string)`

SetEventtype sets Eventtype field to given value.

### HasEventtype

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasEventtype() bool`

HasEventtype returns a boolean if a field has been set.

### GetFormattedlocation

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetFormattedlocation() string`

GetFormattedlocation returns the Formattedlocation field if non-nil, zero value otherwise.

### GetFormattedlocationOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetFormattedlocationOk() (*string, bool)`

GetFormattedlocationOk returns a tuple with the Formattedlocation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedlocation

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetFormattedlocation(v string)`

SetFormattedlocation sets Formattedlocation field to given value.

### HasFormattedlocation

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasFormattedlocation() bool`

HasFormattedlocation returns a boolean if a field has been set.

### GetFormattedtime

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetFormattedtime() string`

GetFormattedtime returns the Formattedtime field if non-nil, zero value otherwise.

### GetFormattedtimeOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetFormattedtimeOk() (*string, bool)`

GetFormattedtimeOk returns a tuple with the Formattedtime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedtime

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetFormattedtime(v string)`

SetFormattedtime sets Formattedtime field to given value.

### HasFormattedtime

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasFormattedtime() bool`

HasFormattedtime returns a boolean if a field has been set.

### GetGroupid

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetGroupname

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetGroupname() string`

GetGroupname returns the Groupname field if non-nil, zero value otherwise.

### GetGroupnameOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetGroupnameOk() (*string, bool)`

GetGroupnameOk returns a tuple with the Groupname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupname

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetGroupname(v string)`

SetGroupname sets Groupname field to given value.

### HasGroupname

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasGroupname() bool`

HasGroupname returns a boolean if a field has been set.

### GetIcon

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetIcon() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon`

GetIcon returns the Icon field if non-nil, zero value otherwise.

### GetIconOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetIconOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon, bool)`

GetIconOk returns a tuple with the Icon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIcon

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetIcon(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon)`

SetIcon sets Icon field to given value.

### HasIcon

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasIcon() bool`

HasIcon returns a boolean if a field has been set.

### GetId

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInstance

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetInstance() int32`

GetInstance returns the Instance field if non-nil, zero value otherwise.

### GetInstanceOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetInstanceOk() (*int32, bool)`

GetInstanceOk returns a tuple with the Instance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstance

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetInstance(v int32)`

SetInstance sets Instance field to given value.

### HasInstance

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasInstance() bool`

HasInstance returns a boolean if a field has been set.

### GetIsactionevent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetIsactionevent() bool`

GetIsactionevent returns the Isactionevent field if non-nil, zero value otherwise.

### GetIsactioneventOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetIsactioneventOk() (*bool, bool)`

GetIsactioneventOk returns a tuple with the Isactionevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsactionevent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetIsactionevent(v bool)`

SetIsactionevent sets Isactionevent field to given value.

### HasIsactionevent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasIsactionevent() bool`

HasIsactionevent returns a boolean if a field has been set.

### GetIscategoryevent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetIscategoryevent() bool`

GetIscategoryevent returns the Iscategoryevent field if non-nil, zero value otherwise.

### GetIscategoryeventOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetIscategoryeventOk() (*bool, bool)`

GetIscategoryeventOk returns a tuple with the Iscategoryevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscategoryevent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetIscategoryevent(v bool)`

SetIscategoryevent sets Iscategoryevent field to given value.

### HasIscategoryevent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasIscategoryevent() bool`

HasIscategoryevent returns a boolean if a field has been set.

### GetIscourseevent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetIscourseevent() bool`

GetIscourseevent returns the Iscourseevent field if non-nil, zero value otherwise.

### GetIscourseeventOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetIscourseeventOk() (*bool, bool)`

GetIscourseeventOk returns a tuple with the Iscourseevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscourseevent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetIscourseevent(v bool)`

SetIscourseevent sets Iscourseevent field to given value.

### HasIscourseevent

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasIscourseevent() bool`

HasIscourseevent returns a boolean if a field has been set.

### GetIslastday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetIslastday() bool`

GetIslastday returns the Islastday field if non-nil, zero value otherwise.

### GetIslastdayOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetIslastdayOk() (*bool, bool)`

GetIslastdayOk returns a tuple with the Islastday field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIslastday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetIslastday(v bool)`

SetIslastday sets Islastday field to given value.

### HasIslastday

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasIslastday() bool`

HasIslastday returns a boolean if a field has been set.

### GetLocation

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetLocation(v string)`

SetLocation sets Location field to given value.

### HasLocation

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasLocation() bool`

HasLocation returns a boolean if a field has been set.

### GetMaxdayerror

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetMaxdayerror() string`

GetMaxdayerror returns the Maxdayerror field if non-nil, zero value otherwise.

### GetMaxdayerrorOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetMaxdayerrorOk() (*string, bool)`

GetMaxdayerrorOk returns a tuple with the Maxdayerror field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxdayerror

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetMaxdayerror(v string)`

SetMaxdayerror sets Maxdayerror field to given value.

### HasMaxdayerror

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasMaxdayerror() bool`

HasMaxdayerror returns a boolean if a field has been set.

### GetMaxdaytimestamp

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetMaxdaytimestamp() int32`

GetMaxdaytimestamp returns the Maxdaytimestamp field if non-nil, zero value otherwise.

### GetMaxdaytimestampOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetMaxdaytimestampOk() (*int32, bool)`

GetMaxdaytimestampOk returns a tuple with the Maxdaytimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxdaytimestamp

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetMaxdaytimestamp(v int32)`

SetMaxdaytimestamp sets Maxdaytimestamp field to given value.

### HasMaxdaytimestamp

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasMaxdaytimestamp() bool`

HasMaxdaytimestamp returns a boolean if a field has been set.

### GetMindayerror

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetMindayerror() string`

GetMindayerror returns the Mindayerror field if non-nil, zero value otherwise.

### GetMindayerrorOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetMindayerrorOk() (*string, bool)`

GetMindayerrorOk returns a tuple with the Mindayerror field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMindayerror

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetMindayerror(v string)`

SetMindayerror sets Mindayerror field to given value.

### HasMindayerror

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasMindayerror() bool`

HasMindayerror returns a boolean if a field has been set.

### GetMindaytimestamp

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetMindaytimestamp() int32`

GetMindaytimestamp returns the Mindaytimestamp field if non-nil, zero value otherwise.

### GetMindaytimestampOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetMindaytimestampOk() (*int32, bool)`

GetMindaytimestampOk returns a tuple with the Mindaytimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMindaytimestamp

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetMindaytimestamp(v int32)`

SetMindaytimestamp sets Mindaytimestamp field to given value.

### HasMindaytimestamp

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasMindaytimestamp() bool`

HasMindaytimestamp returns a boolean if a field has been set.

### GetModulename

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetModulename() string`

GetModulename returns the Modulename field if non-nil, zero value otherwise.

### GetModulenameOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetModulenameOk() (*string, bool)`

GetModulenameOk returns a tuple with the Modulename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModulename

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetModulename(v string)`

SetModulename sets Modulename field to given value.

### HasModulename

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasModulename() bool`

HasModulename returns a boolean if a field has been set.

### GetName

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNormalisedeventtype

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetNormalisedeventtype() string`

GetNormalisedeventtype returns the Normalisedeventtype field if non-nil, zero value otherwise.

### GetNormalisedeventtypeOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetNormalisedeventtypeOk() (*string, bool)`

GetNormalisedeventtypeOk returns a tuple with the Normalisedeventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNormalisedeventtype

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetNormalisedeventtype(v string)`

SetNormalisedeventtype sets Normalisedeventtype field to given value.

### HasNormalisedeventtype

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasNormalisedeventtype() bool`

HasNormalisedeventtype returns a boolean if a field has been set.

### GetNormalisedeventtypetext

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetNormalisedeventtypetext() string`

GetNormalisedeventtypetext returns the Normalisedeventtypetext field if non-nil, zero value otherwise.

### GetNormalisedeventtypetextOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetNormalisedeventtypetextOk() (*string, bool)`

GetNormalisedeventtypetextOk returns a tuple with the Normalisedeventtypetext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNormalisedeventtypetext

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetNormalisedeventtypetext(v string)`

SetNormalisedeventtypetext sets Normalisedeventtypetext field to given value.

### HasNormalisedeventtypetext

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasNormalisedeventtypetext() bool`

HasNormalisedeventtypetext returns a boolean if a field has been set.

### GetOverdue

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetOverdue() bool`

GetOverdue returns the Overdue field if non-nil, zero value otherwise.

### GetOverdueOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetOverdueOk() (*bool, bool)`

GetOverdueOk returns a tuple with the Overdue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverdue

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetOverdue(v bool)`

SetOverdue sets Overdue field to given value.

### HasOverdue

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasOverdue() bool`

HasOverdue returns a boolean if a field has been set.

### GetPopupname

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetPopupname() string`

GetPopupname returns the Popupname field if non-nil, zero value otherwise.

### GetPopupnameOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetPopupnameOk() (*string, bool)`

GetPopupnameOk returns a tuple with the Popupname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPopupname

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetPopupname(v string)`

SetPopupname sets Popupname field to given value.

### HasPopupname

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasPopupname() bool`

HasPopupname returns a boolean if a field has been set.

### GetPurpose

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.

### HasPurpose

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasPurpose() bool`

HasPurpose returns a boolean if a field has been set.

### GetRepeatid

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetRepeatid() int32`

GetRepeatid returns the Repeatid field if non-nil, zero value otherwise.

### GetRepeatidOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetRepeatidOk() (*int32, bool)`

GetRepeatidOk returns a tuple with the Repeatid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepeatid

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetRepeatid(v int32)`

SetRepeatid sets Repeatid field to given value.

### HasRepeatid

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasRepeatid() bool`

HasRepeatid returns a boolean if a field has been set.

### GetSubscription

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetSubscription() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription`

GetSubscription returns the Subscription field if non-nil, zero value otherwise.

### GetSubscriptionOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetSubscriptionOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription, bool)`

GetSubscriptionOk returns a tuple with the Subscription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscription

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetSubscription(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription)`

SetSubscription sets Subscription field to given value.

### HasSubscription

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasSubscription() bool`

HasSubscription returns a boolean if a field has been set.

### GetTimeduration

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetTimeduration() int32`

GetTimeduration returns the Timeduration field if non-nil, zero value otherwise.

### GetTimedurationOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetTimedurationOk() (*int32, bool)`

GetTimedurationOk returns a tuple with the Timeduration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeduration

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetTimeduration(v int32)`

SetTimeduration sets Timeduration field to given value.

### HasTimeduration

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasTimeduration() bool`

HasTimeduration returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimesort

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetTimesort() int32`

GetTimesort returns the Timesort field if non-nil, zero value otherwise.

### GetTimesortOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetTimesortOk() (*int32, bool)`

GetTimesortOk returns a tuple with the Timesort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimesort

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetTimesort(v int32)`

SetTimesort sets Timesort field to given value.

### HasTimesort

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasTimesort() bool`

HasTimesort returns a boolean if a field has been set.

### GetTimestart

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetTimeusermidnight

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetTimeusermidnight() int32`

GetTimeusermidnight returns the Timeusermidnight field if non-nil, zero value otherwise.

### GetTimeusermidnightOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetTimeusermidnightOk() (*int32, bool)`

GetTimeusermidnightOk returns a tuple with the Timeusermidnight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeusermidnight

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetTimeusermidnight(v int32)`

SetTimeusermidnight sets Timeusermidnight field to given value.

### HasTimeusermidnight

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasTimeusermidnight() bool`

HasTimeusermidnight returns a boolean if a field has been set.

### GetUrl

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetViewurl

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetViewurl() string`

GetViewurl returns the Viewurl field if non-nil, zero value otherwise.

### GetViewurlOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetViewurlOk() (*string, bool)`

GetViewurlOk returns a tuple with the Viewurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewurl

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetViewurl(v string)`

SetViewurl sets Viewurl field to given value.

### HasViewurl

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasViewurl() bool`

HasViewurl returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


