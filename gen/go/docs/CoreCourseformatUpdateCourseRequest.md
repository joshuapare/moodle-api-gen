# CoreCourseformatUpdateCourseRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | **string** | action: cm_hide, cm_show, section_hide, section_show, cm_moveleft... | [default to "null"]
**Courseid** | **int32** | course id | 
**Ids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Targetcmid** | Pointer to **int32** | Optional target cm id | [optional] [default to null]
**Targetsectionid** | Pointer to **int32** | Optional target section id | [optional] [default to null]

## Methods

### NewCoreCourseformatUpdateCourseRequest

`func NewCoreCourseformatUpdateCourseRequest(action string, courseid int32, ) *CoreCourseformatUpdateCourseRequest`

NewCoreCourseformatUpdateCourseRequest instantiates a new CoreCourseformatUpdateCourseRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseformatUpdateCourseRequestWithDefaults

`func NewCoreCourseformatUpdateCourseRequestWithDefaults() *CoreCourseformatUpdateCourseRequest`

NewCoreCourseformatUpdateCourseRequestWithDefaults instantiates a new CoreCourseformatUpdateCourseRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAction

`func (o *CoreCourseformatUpdateCourseRequest) GetAction() string`

GetAction returns the Action field if non-nil, zero value otherwise.

### GetActionOk

`func (o *CoreCourseformatUpdateCourseRequest) GetActionOk() (*string, bool)`

GetActionOk returns a tuple with the Action field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAction

`func (o *CoreCourseformatUpdateCourseRequest) SetAction(v string)`

SetAction sets Action field to given value.


### GetCourseid

`func (o *CoreCourseformatUpdateCourseRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCourseformatUpdateCourseRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCourseformatUpdateCourseRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetIds

`func (o *CoreCourseformatUpdateCourseRequest) GetIds() []map[string]interface{}`

GetIds returns the Ids field if non-nil, zero value otherwise.

### GetIdsOk

`func (o *CoreCourseformatUpdateCourseRequest) GetIdsOk() (*[]map[string]interface{}, bool)`

GetIdsOk returns a tuple with the Ids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIds

`func (o *CoreCourseformatUpdateCourseRequest) SetIds(v []map[string]interface{})`

SetIds sets Ids field to given value.

### HasIds

`func (o *CoreCourseformatUpdateCourseRequest) HasIds() bool`

HasIds returns a boolean if a field has been set.

### GetTargetcmid

`func (o *CoreCourseformatUpdateCourseRequest) GetTargetcmid() int32`

GetTargetcmid returns the Targetcmid field if non-nil, zero value otherwise.

### GetTargetcmidOk

`func (o *CoreCourseformatUpdateCourseRequest) GetTargetcmidOk() (*int32, bool)`

GetTargetcmidOk returns a tuple with the Targetcmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetcmid

`func (o *CoreCourseformatUpdateCourseRequest) SetTargetcmid(v int32)`

SetTargetcmid sets Targetcmid field to given value.

### HasTargetcmid

`func (o *CoreCourseformatUpdateCourseRequest) HasTargetcmid() bool`

HasTargetcmid returns a boolean if a field has been set.

### GetTargetsectionid

`func (o *CoreCourseformatUpdateCourseRequest) GetTargetsectionid() int32`

GetTargetsectionid returns the Targetsectionid field if non-nil, zero value otherwise.

### GetTargetsectionidOk

`func (o *CoreCourseformatUpdateCourseRequest) GetTargetsectionidOk() (*int32, bool)`

GetTargetsectionidOk returns a tuple with the Targetsectionid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetsectionid

`func (o *CoreCourseformatUpdateCourseRequest) SetTargetsectionid(v int32)`

SetTargetsectionid sets Targetsectionid field to given value.

### HasTargetsectionid

`func (o *CoreCourseformatUpdateCourseRequest) HasTargetsectionid() bool`

HasTargetsectionid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


