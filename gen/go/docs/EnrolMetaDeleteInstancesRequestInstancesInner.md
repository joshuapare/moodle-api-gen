# EnrolMetaDeleteInstancesRequestInstancesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | Pointer to **string** | ID of the course where meta enrolment is linked to. | [optional] 
**Metacourseid** | Pointer to **int32** | ID of the course with meta enrolment. | [optional] [default to null]

## Methods

### NewEnrolMetaDeleteInstancesRequestInstancesInner

`func NewEnrolMetaDeleteInstancesRequestInstancesInner() *EnrolMetaDeleteInstancesRequestInstancesInner`

NewEnrolMetaDeleteInstancesRequestInstancesInner instantiates a new EnrolMetaDeleteInstancesRequestInstancesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnrolMetaDeleteInstancesRequestInstancesInnerWithDefaults

`func NewEnrolMetaDeleteInstancesRequestInstancesInnerWithDefaults() *EnrolMetaDeleteInstancesRequestInstancesInner`

NewEnrolMetaDeleteInstancesRequestInstancesInnerWithDefaults instantiates a new EnrolMetaDeleteInstancesRequestInstancesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *EnrolMetaDeleteInstancesRequestInstancesInner) GetCourseid() string`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *EnrolMetaDeleteInstancesRequestInstancesInner) GetCourseidOk() (*string, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *EnrolMetaDeleteInstancesRequestInstancesInner) SetCourseid(v string)`

SetCourseid sets Courseid field to given value.

### HasCourseid

`func (o *EnrolMetaDeleteInstancesRequestInstancesInner) HasCourseid() bool`

HasCourseid returns a boolean if a field has been set.

### GetMetacourseid

`func (o *EnrolMetaDeleteInstancesRequestInstancesInner) GetMetacourseid() int32`

GetMetacourseid returns the Metacourseid field if non-nil, zero value otherwise.

### GetMetacourseidOk

`func (o *EnrolMetaDeleteInstancesRequestInstancesInner) GetMetacourseidOk() (*int32, bool)`

GetMetacourseidOk returns a tuple with the Metacourseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetacourseid

`func (o *EnrolMetaDeleteInstancesRequestInstancesInner) SetMetacourseid(v int32)`

SetMetacourseid sets Metacourseid field to given value.

### HasMetacourseid

`func (o *EnrolMetaDeleteInstancesRequestInstancesInner) HasMetacourseid() bool`

HasMetacourseid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


