# CoreCourseDuplicateCourseRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categoryid** | **int32** | duplicated course category parent | [default to null]
**Courseid** | **int32** | course to duplicate id | [default to null]
**Fullname** | **string** | duplicated course full name | [default to "null"]
**Options** | Pointer to [**[]CoreCourseDuplicateCourseRequestOptionsInner**](CoreCourseDuplicateCourseRequestOptionsInner.md) |  | [optional] 
**Shortname** | **string** | duplicated course short name | [default to "null"]
**Visible** | Pointer to **int32** | duplicated course visible, default to yes | [optional] [default to 1]

## Methods

### NewCoreCourseDuplicateCourseRequest

`func NewCoreCourseDuplicateCourseRequest(categoryid int32, courseid int32, fullname string, shortname string, ) *CoreCourseDuplicateCourseRequest`

NewCoreCourseDuplicateCourseRequest instantiates a new CoreCourseDuplicateCourseRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseDuplicateCourseRequestWithDefaults

`func NewCoreCourseDuplicateCourseRequestWithDefaults() *CoreCourseDuplicateCourseRequest`

NewCoreCourseDuplicateCourseRequestWithDefaults instantiates a new CoreCourseDuplicateCourseRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCategoryid

`func (o *CoreCourseDuplicateCourseRequest) GetCategoryid() int32`

GetCategoryid returns the Categoryid field if non-nil, zero value otherwise.

### GetCategoryidOk

`func (o *CoreCourseDuplicateCourseRequest) GetCategoryidOk() (*int32, bool)`

GetCategoryidOk returns a tuple with the Categoryid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategoryid

`func (o *CoreCourseDuplicateCourseRequest) SetCategoryid(v int32)`

SetCategoryid sets Categoryid field to given value.


### GetCourseid

`func (o *CoreCourseDuplicateCourseRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreCourseDuplicateCourseRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreCourseDuplicateCourseRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetFullname

`func (o *CoreCourseDuplicateCourseRequest) GetFullname() string`

GetFullname returns the Fullname field if non-nil, zero value otherwise.

### GetFullnameOk

`func (o *CoreCourseDuplicateCourseRequest) GetFullnameOk() (*string, bool)`

GetFullnameOk returns a tuple with the Fullname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullname

`func (o *CoreCourseDuplicateCourseRequest) SetFullname(v string)`

SetFullname sets Fullname field to given value.


### GetOptions

`func (o *CoreCourseDuplicateCourseRequest) GetOptions() []CoreCourseDuplicateCourseRequestOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *CoreCourseDuplicateCourseRequest) GetOptionsOk() (*[]CoreCourseDuplicateCourseRequestOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *CoreCourseDuplicateCourseRequest) SetOptions(v []CoreCourseDuplicateCourseRequestOptionsInner)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *CoreCourseDuplicateCourseRequest) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetShortname

`func (o *CoreCourseDuplicateCourseRequest) GetShortname() string`

GetShortname returns the Shortname field if non-nil, zero value otherwise.

### GetShortnameOk

`func (o *CoreCourseDuplicateCourseRequest) GetShortnameOk() (*string, bool)`

GetShortnameOk returns a tuple with the Shortname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShortname

`func (o *CoreCourseDuplicateCourseRequest) SetShortname(v string)`

SetShortname sets Shortname field to given value.


### GetVisible

`func (o *CoreCourseDuplicateCourseRequest) GetVisible() int32`

GetVisible returns the Visible field if non-nil, zero value otherwise.

### GetVisibleOk

`func (o *CoreCourseDuplicateCourseRequest) GetVisibleOk() (*int32, bool)`

GetVisibleOk returns a tuple with the Visible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisible

`func (o *CoreCourseDuplicateCourseRequest) SetVisible(v int32)`

SetVisible sets Visible field to given value.

### HasVisible

`func (o *CoreCourseDuplicateCourseRequest) HasVisible() bool`

HasVisible returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


