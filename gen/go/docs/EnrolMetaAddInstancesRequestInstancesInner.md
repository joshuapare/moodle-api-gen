# EnrolMetaAddInstancesRequestInstancesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **string** | ID of the course where meta enrolment is linked to. | [optional] [default to "null"]
**Creategroup** | Pointer to **bool** | Creates group in meta course named after linked course and puts all enrolled users in this group | [optional] [default to false]
**Metacourseid** | Pointer to **int32** | ID of the course where meta enrolment is added. | [optional] [default to null]

## Methods

### NewEnrolMetaAddInstancesRequestInstancesInner

`func NewEnrolMetaAddInstancesRequestInstancesInner() *EnrolMetaAddInstancesRequestInstancesInner`

NewEnrolMetaAddInstancesRequestInstancesInner instantiates a new EnrolMetaAddInstancesRequestInstancesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnrolMetaAddInstancesRequestInstancesInnerWithDefaults

`func NewEnrolMetaAddInstancesRequestInstancesInnerWithDefaults() *EnrolMetaAddInstancesRequestInstancesInner`

NewEnrolMetaAddInstancesRequestInstancesInnerWithDefaults instantiates a new EnrolMetaAddInstancesRequestInstancesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *EnrolMetaAddInstancesRequestInstancesInner) GetCourseid() string`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *EnrolMetaAddInstancesRequestInstancesInner) GetCourseidOk() (*string, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *EnrolMetaAddInstancesRequestInstancesInner) SetCourseid(v string)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *EnrolMetaAddInstancesRequestInstancesInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetCreategroup

`func (o *EnrolMetaAddInstancesRequestInstancesInner) GetCreategroup() bool`

GetCreategroup returns the Creategroup field if non-nil, zero value otherwise.

### GetCreategroupOk

`func (o *EnrolMetaAddInstancesRequestInstancesInner) GetCreategroupOk() (*bool, bool)`

GetCreategroupOk returns a tuple with the Creategroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreategroup

`func (o *EnrolMetaAddInstancesRequestInstancesInner) SetCreategroup(v bool)`

SetCreategroup sets Creategroup field to given value.

### HasCreategroup

`func (o *EnrolMetaAddInstancesRequestInstancesInner) HasCreategroup() bool`

HasCreategroup returns a boolean if a field has been set.

### GetMetacourseid

`func (o *EnrolMetaAddInstancesRequestInstancesInner) GetMetacourseid() int32`

GetMetacourseid returns the Metacourseid field if non-nil, zero value otherwise.

### GetMetacourseidOk

`func (o *EnrolMetaAddInstancesRequestInstancesInner) GetMetacourseidOk() (*int32, bool)`

GetMetacourseidOk returns a tuple with the Metacourseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetacourseid

`func (o *EnrolMetaAddInstancesRequestInstancesInner) SetMetacourseid(v int32)`

SetMetacourseid sets Metacourseid field to given value.

### HasMetacourseid

`func (o *EnrolMetaAddInstancesRequestInstancesInner) HasMetacourseid() bool`

HasMetacourseid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


