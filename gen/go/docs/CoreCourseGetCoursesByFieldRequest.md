# CoreCourseGetCoursesByFieldRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Field** | Pointer to **string** | The field to search can be left empty for all courses or:                     id: course id                     ids: comma separated course ids                     shortname: course short name                     idnumber: course id number                     category: category id the course belongs to                  | [optional] [default to ""]
**Value** | Pointer to **string** | The value to match | [optional] [default to ""]

## Methods

### NewCoreCourseGetCoursesByFieldRequest

`func NewCoreCourseGetCoursesByFieldRequest() *CoreCourseGetCoursesByFieldRequest`

NewCoreCourseGetCoursesByFieldRequest instantiates a new CoreCourseGetCoursesByFieldRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseGetCoursesByFieldRequestWithDefaults

`func NewCoreCourseGetCoursesByFieldRequestWithDefaults() *CoreCourseGetCoursesByFieldRequest`

NewCoreCourseGetCoursesByFieldRequestWithDefaults instantiates a new CoreCourseGetCoursesByFieldRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetField

`func (o *CoreCourseGetCoursesByFieldRequest) GetField() string`

GetField returns the Field field if non-nil, zero value otherwise.

### GetFieldOk

`func (o *CoreCourseGetCoursesByFieldRequest) GetFieldOk() (*string, bool)`

GetFieldOk returns a tuple with the Field field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetField

`func (o *CoreCourseGetCoursesByFieldRequest) SetField(v string)`

SetField sets Field field to given value.

### HasField

`func (o *CoreCourseGetCoursesByFieldRequest) HasField() bool`

HasField returns a boolean if a field has been set.

### GetValue

`func (o *CoreCourseGetCoursesByFieldRequest) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CoreCourseGetCoursesByFieldRequest) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CoreCourseGetCoursesByFieldRequest) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *CoreCourseGetCoursesByFieldRequest) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


