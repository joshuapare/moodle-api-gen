# CoreCalendarGetCalendarDayView200ResponseEventsInner

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
**Maxdayerror** | Pointer to **string** | maxdayerror | [optional] [default to "null"]
**Maxdaytimestamp** | Pointer to **int32** | maxdaytimestamp | [optional] [default to null]
**Mindayerror** | Pointer to **string** | mindayerror | [optional] [default to "null"]
**Mindaytimestamp** | Pointer to **int32** | mindaytimestamp | [optional] [default to null]
**Modulename** | Pointer to **string** | modulename | [optional] 
**Name** | Pointer to **string** | name | [optional] 
**Normalisedeventtype** | Pointer to **string** | normalisedeventtype | [optional] 
**Normalisedeventtypetext** | Pointer to **string** | normalisedeventtypetext | [optional] 
**Overdue** | Pointer to **bool** | overdue | [optional] [default to false]
**Popupname** | Pointer to **string** | popupname | [optional] [default to "null"]
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

### NewCoreCalendarGetCalendarDayView200ResponseEventsInner

`func NewCoreCalendarGetCalendarDayView200ResponseEventsInner() *CoreCalendarGetCalendarDayView200ResponseEventsInner`

NewCoreCalendarGetCalendarDayView200ResponseEventsInner instantiates a new CoreCalendarGetCalendarDayView200ResponseEventsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCalendarGetCalendarDayView200ResponseEventsInnerWithDefaults

`func NewCoreCalendarGetCalendarDayView200ResponseEventsInnerWithDefaults() *CoreCalendarGetCalendarDayView200ResponseEventsInner`

NewCoreCalendarGetCalendarDayView200ResponseEventsInnerWithDefaults instantiates a new CoreCalendarGetCalendarDayView200ResponseEventsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetAction() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetActionOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetAction(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction)`

SetAction sets Action field to given value.

### HasAction

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasAction() bool`

HasAction returns a boolean if a field has been set.

### GetActivityname

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetActivityname() string`

GetActivityname returns the Activityname field if non-nil, zero value otherwise.

### GetActivitynameOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetActivitynameOk() (*string, bool)`

GetActivitynameOk returns a tuple with the Activityname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityname

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetActivityname(v string)`

SetActivityname sets Activityname field to given value.

### HasActivityname

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasActivityname() bool`

HasActivityname returns a boolean if a field has been set.

### GetActivitystr

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetActivitystr() string`

GetActivitystr returns the Activitystr field if non-nil, zero value otherwise.

### GetActivitystrOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetActivitystrOk() (*string, bool)`

GetActivitystrOk returns a tuple with the Activitystr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivitystr

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetActivitystr(v string)`

SetActivitystr sets Activitystr field to given value.

### HasActivitystr

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasActivitystr() bool`

HasActivitystr returns a boolean if a field has been set.

### GetCandelete

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetCandelete() bool`

GetCandelete returns the Candelete field if non-nil, zero value otherwise.

### GetCandeleteOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetCandeleteOk() (*bool, bool)`

GetCandeleteOk returns a tuple with the Candelete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCandelete

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetCandelete(v bool)`

SetCandelete sets Candelete field to given value.

### HasCandelete

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasCandelete() bool`

HasCandelete returns a boolean if a field has been set.

### GetCanedit

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetCanedit() bool`

GetCanedit returns the Canedit field if non-nil, zero value otherwise.

### GetCaneditOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetCaneditOk() (*bool, bool)`

GetCaneditOk returns a tuple with the Canedit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanedit

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetCanedit(v bool)`

SetCanedit sets Canedit field to given value.

### HasCanedit

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasCanedit() bool`

HasCanedit returns a boolean if a field has been set.

### GetCategory

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetCategory() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetCategoryOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetCategory(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetCategoryid

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.

### HasCategoryid

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasCategoryid() bool`

HasCategoryid returns a boolean if a field has been set.

### GetComponent

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetComponent(v string)`

SetComponent sets Component field to given value.

### HasComponent

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasComponent() bool`

HasComponent returns a boolean if a field has been set.

### GetCourse

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetCourse() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetCourseOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetCourse(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetDeleteurl

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetDeleteurl() string`

GetDeleteurl returns the Deleteurl field if non-nil, zero value otherwise.

### GetDeleteurlOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetDeleteurlOk() (*string, bool)`

GetDeleteurlOk returns a tuple with the Deleteurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleteurl

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetDeleteurl(v string)`

SetDeleteurl sets Deleteurl field to given value.

### HasDeleteurl

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasDeleteurl() bool`

HasDeleteurl returns a boolean if a field has been set.

### GetDescription

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetDescriptionformat

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetDescriptionformat() int32`

GetDescriptionformat returns the Descriptionformat field if non-nil, zero value otherwise.

### GetDescriptionformatOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetDescriptionformatOk() (*int32, bool)`

GetDescriptionformatOk returns a tuple with the Descriptionformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionformat

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetDescriptionformat(v int32)`

SetDescriptionformat sets Descriptionformat field to given value.

### HasDescriptionformat

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasDescriptionformat() bool`

HasDescriptionformat returns a boolean if a field has been set.

### GetDraggable

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetDraggable() bool`

GetDraggable returns the Draggable field if non-nil, zero value otherwise.

### GetDraggableOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetDraggableOk() (*bool, bool)`

GetDraggableOk returns a tuple with the Draggable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDraggable

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetDraggable(v bool)`

SetDraggable sets Draggable field to given value.

### HasDraggable

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasDraggable() bool`

HasDraggable returns a boolean if a field has been set.

### GetEditurl

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetEditurl() string`

GetEditurl returns the Editurl field if non-nil, zero value otherwise.

### GetEditurlOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetEditurlOk() (*string, bool)`

GetEditurlOk returns a tuple with the Editurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEditurl

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetEditurl(v string)`

SetEditurl sets Editurl field to given value.

### HasEditurl

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasEditurl() bool`

HasEditurl returns a boolean if a field has been set.

### GetEventcount

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetEventcount() int32`

GetEventcount returns the Eventcount field if non-nil, zero value otherwise.

### GetEventcountOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetEventcountOk() (*int32, bool)`

GetEventcountOk returns a tuple with the Eventcount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventcount

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetEventcount(v int32)`

SetEventcount sets Eventcount field to given value.

### HasEventcount

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasEventcount() bool`

HasEventcount returns a boolean if a field has been set.

### GetEventtype

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetEventtype() string`

GetEventtype returns the Eventtype field if non-nil, zero value otherwise.

### GetEventtypeOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetEventtypeOk() (*string, bool)`

GetEventtypeOk returns a tuple with the Eventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventtype

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetEventtype(v string)`

SetEventtype sets Eventtype field to given value.

### HasEventtype

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasEventtype() bool`

HasEventtype returns a boolean if a field has been set.

### GetFormattedlocation

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetFormattedlocation() string`

GetFormattedlocation returns the Formattedlocation field if non-nil, zero value otherwise.

### GetFormattedlocationOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetFormattedlocationOk() (*string, bool)`

GetFormattedlocationOk returns a tuple with the Formattedlocation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedlocation

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetFormattedlocation(v string)`

SetFormattedlocation sets Formattedlocation field to given value.

### HasFormattedlocation

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasFormattedlocation() bool`

HasFormattedlocation returns a boolean if a field has been set.

### GetFormattedtime

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetFormattedtime() string`

GetFormattedtime returns the Formattedtime field if non-nil, zero value otherwise.

### GetFormattedtimeOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetFormattedtimeOk() (*string, bool)`

GetFormattedtimeOk returns a tuple with the Formattedtime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormattedtime

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetFormattedtime(v string)`

SetFormattedtime sets Formattedtime field to given value.

### HasFormattedtime

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasFormattedtime() bool`

HasFormattedtime returns a boolean if a field has been set.

### GetGroupid

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.

### HasGroupid

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasGroupid() bool`

HasGroupid returns a boolean if a field has been set.

### GetGroupname

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetGroupname() string`

GetGroupname returns the Groupname field if non-nil, zero value otherwise.

### GetGroupnameOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetGroupnameOk() (*string, bool)`

GetGroupnameOk returns a tuple with the Groupname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupname

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetGroupname(v string)`

SetGroupname sets Groupname field to given value.

### HasGroupname

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasGroupname() bool`

HasGroupname returns a boolean if a field has been set.

### GetIcon

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetIcon() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon`

GetIcon returns the Icon field if non-nil, zero value otherwise.

### GetIconOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetIconOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon, bool)`

GetIconOk returns a tuple with the Icon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIcon

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetIcon(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon)`

SetIcon sets Icon field to given value.

### HasIcon

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasIcon() bool`

HasIcon returns a boolean if a field has been set.

### GetId

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetInstance

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetInstance() int32`

GetInstance returns the Instance field if non-nil, zero value otherwise.

### GetInstanceOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetInstanceOk() (*int32, bool)`

GetInstanceOk returns a tuple with the Instance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstance

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetInstance(v int32)`

SetInstance sets Instance field to given value.

### HasInstance

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasInstance() bool`

HasInstance returns a boolean if a field has been set.

### GetIsactionevent

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetIsactionevent() bool`

GetIsactionevent returns the Isactionevent field if non-nil, zero value otherwise.

### GetIsactioneventOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetIsactioneventOk() (*bool, bool)`

GetIsactioneventOk returns a tuple with the Isactionevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsactionevent

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetIsactionevent(v bool)`

SetIsactionevent sets Isactionevent field to given value.

### HasIsactionevent

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasIsactionevent() bool`

HasIsactionevent returns a boolean if a field has been set.

### GetIscategoryevent

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetIscategoryevent() bool`

GetIscategoryevent returns the Iscategoryevent field if non-nil, zero value otherwise.

### GetIscategoryeventOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetIscategoryeventOk() (*bool, bool)`

GetIscategoryeventOk returns a tuple with the Iscategoryevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscategoryevent

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetIscategoryevent(v bool)`

SetIscategoryevent sets Iscategoryevent field to given value.

### HasIscategoryevent

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasIscategoryevent() bool`

HasIscategoryevent returns a boolean if a field has been set.

### GetIscourseevent

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetIscourseevent() bool`

GetIscourseevent returns the Iscourseevent field if non-nil, zero value otherwise.

### GetIscourseeventOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetIscourseeventOk() (*bool, bool)`

GetIscourseeventOk returns a tuple with the Iscourseevent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIscourseevent

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetIscourseevent(v bool)`

SetIscourseevent sets Iscourseevent field to given value.

### HasIscourseevent

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasIscourseevent() bool`

HasIscourseevent returns a boolean if a field has been set.

### GetIslastday

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetIslastday() bool`

GetIslastday returns the Islastday field if non-nil, zero value otherwise.

### GetIslastdayOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetIslastdayOk() (*bool, bool)`

GetIslastdayOk returns a tuple with the Islastday field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIslastday

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetIslastday(v bool)`

SetIslastday sets Islastday field to given value.

### HasIslastday

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasIslastday() bool`

HasIslastday returns a boolean if a field has been set.

### GetLocation

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetLocation() string`

GetLocation returns the Location field if non-nil, zero value otherwise.

### GetLocationOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetLocationOk() (*string, bool)`

GetLocationOk returns a tuple with the Location field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocation

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetLocation(v string)`

SetLocation sets Location field to given value.

### HasLocation

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasLocation() bool`

HasLocation returns a boolean if a field has been set.

### GetMaxdayerror

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetMaxdayerror() string`

GetMaxdayerror returns the Maxdayerror field if non-nil, zero value otherwise.

### GetMaxdayerrorOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetMaxdayerrorOk() (*string, bool)`

GetMaxdayerrorOk returns a tuple with the Maxdayerror field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxdayerror

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetMaxdayerror(v string)`

SetMaxdayerror sets Maxdayerror field to given value.

### HasMaxdayerror

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasMaxdayerror() bool`

HasMaxdayerror returns a boolean if a field has been set.

### GetMaxdaytimestamp

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetMaxdaytimestamp() int32`

GetMaxdaytimestamp returns the Maxdaytimestamp field if non-nil, zero value otherwise.

### GetMaxdaytimestampOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetMaxdaytimestampOk() (*int32, bool)`

GetMaxdaytimestampOk returns a tuple with the Maxdaytimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxdaytimestamp

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetMaxdaytimestamp(v int32)`

SetMaxdaytimestamp sets Maxdaytimestamp field to given value.

### HasMaxdaytimestamp

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasMaxdaytimestamp() bool`

HasMaxdaytimestamp returns a boolean if a field has been set.

### GetMindayerror

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetMindayerror() string`

GetMindayerror returns the Mindayerror field if non-nil, zero value otherwise.

### GetMindayerrorOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetMindayerrorOk() (*string, bool)`

GetMindayerrorOk returns a tuple with the Mindayerror field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMindayerror

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetMindayerror(v string)`

SetMindayerror sets Mindayerror field to given value.

### HasMindayerror

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasMindayerror() bool`

HasMindayerror returns a boolean if a field has been set.

### GetMindaytimestamp

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetMindaytimestamp() int32`

GetMindaytimestamp returns the Mindaytimestamp field if non-nil, zero value otherwise.

### GetMindaytimestampOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetMindaytimestampOk() (*int32, bool)`

GetMindaytimestampOk returns a tuple with the Mindaytimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMindaytimestamp

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetMindaytimestamp(v int32)`

SetMindaytimestamp sets Mindaytimestamp field to given value.

### HasMindaytimestamp

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasMindaytimestamp() bool`

HasMindaytimestamp returns a boolean if a field has been set.

### GetModulename

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetModulename() string`

GetModulename returns the Modulename field if non-nil, zero value otherwise.

### GetModulenameOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetModulenameOk() (*string, bool)`

GetModulenameOk returns a tuple with the Modulename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetModulename

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetModulename(v string)`

SetModulename sets Modulename field to given value.

### HasModulename

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasModulename() bool`

HasModulename returns a boolean if a field has been set.

### GetName

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetNormalisedeventtype

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetNormalisedeventtype() string`

GetNormalisedeventtype returns the Normalisedeventtype field if non-nil, zero value otherwise.

### GetNormalisedeventtypeOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetNormalisedeventtypeOk() (*string, bool)`

GetNormalisedeventtypeOk returns a tuple with the Normalisedeventtype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNormalisedeventtype

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetNormalisedeventtype(v string)`

SetNormalisedeventtype sets Normalisedeventtype field to given value.

### HasNormalisedeventtype

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasNormalisedeventtype() bool`

HasNormalisedeventtype returns a boolean if a field has been set.

### GetNormalisedeventtypetext

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetNormalisedeventtypetext() string`

GetNormalisedeventtypetext returns the Normalisedeventtypetext field if non-nil, zero value otherwise.

### GetNormalisedeventtypetextOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetNormalisedeventtypetextOk() (*string, bool)`

GetNormalisedeventtypetextOk returns a tuple with the Normalisedeventtypetext field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNormalisedeventtypetext

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetNormalisedeventtypetext(v string)`

SetNormalisedeventtypetext sets Normalisedeventtypetext field to given value.

### HasNormalisedeventtypetext

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasNormalisedeventtypetext() bool`

HasNormalisedeventtypetext returns a boolean if a field has been set.

### GetOverdue

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetOverdue() bool`

GetOverdue returns the Overdue field if non-nil, zero value otherwise.

### GetOverdueOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetOverdueOk() (*bool, bool)`

GetOverdueOk returns a tuple with the Overdue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverdue

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetOverdue(v bool)`

SetOverdue sets Overdue field to given value.

### HasOverdue

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasOverdue() bool`

HasOverdue returns a boolean if a field has been set.

### GetPopupname

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetPopupname() string`

GetPopupname returns the Popupname field if non-nil, zero value otherwise.

### GetPopupnameOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetPopupnameOk() (*string, bool)`

GetPopupnameOk returns a tuple with the Popupname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPopupname

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetPopupname(v string)`

SetPopupname sets Popupname field to given value.

### HasPopupname

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasPopupname() bool`

HasPopupname returns a boolean if a field has been set.

### GetPurpose

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetPurpose() string`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetPurposeOk() (*string, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetPurpose(v string)`

SetPurpose sets Purpose field to given value.

### HasPurpose

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasPurpose() bool`

HasPurpose returns a boolean if a field has been set.

### GetRepeatid

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetRepeatid() int32`

GetRepeatid returns the Repeatid field if non-nil, zero value otherwise.

### GetRepeatidOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetRepeatidOk() (*int32, bool)`

GetRepeatidOk returns a tuple with the Repeatid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRepeatid

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetRepeatid(v int32)`

SetRepeatid sets Repeatid field to given value.

### HasRepeatid

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasRepeatid() bool`

HasRepeatid returns a boolean if a field has been set.

### GetSubscription

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetSubscription() CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription`

GetSubscription returns the Subscription field if non-nil, zero value otherwise.

### GetSubscriptionOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetSubscriptionOk() (*CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription, bool)`

GetSubscriptionOk returns a tuple with the Subscription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubscription

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetSubscription(v CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription)`

SetSubscription sets Subscription field to given value.

### HasSubscription

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasSubscription() bool`

HasSubscription returns a boolean if a field has been set.

### GetTimeduration

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetTimeduration() int32`

GetTimeduration returns the Timeduration field if non-nil, zero value otherwise.

### GetTimedurationOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetTimedurationOk() (*int32, bool)`

GetTimedurationOk returns a tuple with the Timeduration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeduration

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetTimeduration(v int32)`

SetTimeduration sets Timeduration field to given value.

### HasTimeduration

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasTimeduration() bool`

HasTimeduration returns a boolean if a field has been set.

### GetTimemodified

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.

### GetTimesort

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetTimesort() int32`

GetTimesort returns the Timesort field if non-nil, zero value otherwise.

### GetTimesortOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetTimesortOk() (*int32, bool)`

GetTimesortOk returns a tuple with the Timesort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimesort

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetTimesort(v int32)`

SetTimesort sets Timesort field to given value.

### HasTimesort

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasTimesort() bool`

HasTimesort returns a boolean if a field has been set.

### GetTimestart

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetTimestart() int32`

GetTimestart returns the Timestart field if non-nil, zero value otherwise.

### GetTimestartOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetTimestartOk() (*int32, bool)`

GetTimestartOk returns a tuple with the Timestart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestart

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetTimestart(v int32)`

SetTimestart sets Timestart field to given value.

### HasTimestart

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasTimestart() bool`

HasTimestart returns a boolean if a field has been set.

### GetTimeusermidnight

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetTimeusermidnight() int32`

GetTimeusermidnight returns the Timeusermidnight field if non-nil, zero value otherwise.

### GetTimeusermidnightOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetTimeusermidnightOk() (*int32, bool)`

GetTimeusermidnightOk returns a tuple with the Timeusermidnight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeusermidnight

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetTimeusermidnight(v int32)`

SetTimeusermidnight sets Timeusermidnight field to given value.

### HasTimeusermidnight

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasTimeusermidnight() bool`

HasTimeusermidnight returns a boolean if a field has been set.

### GetUrl

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetUserid

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetUserid(v int32)`

SetUserid sets Userid field to given value.

### HasUserid

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasUserid() bool`

HasUserid returns a boolean if a field has been set.

### GetViewurl

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetViewurl() string`

GetViewurl returns the Viewurl field if non-nil, zero value otherwise.

### GetViewurlOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetViewurlOk() (*string, bool)`

GetViewurlOk returns a tuple with the Viewurl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewurl

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetViewurl(v string)`

SetViewurl sets Viewurl field to given value.

### HasViewurl

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasViewurl() bool`

HasViewurl returns a boolean if a field has been set.

### GetVisible

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCalendarGetCalendarDayView200ResponseEventsInner) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


