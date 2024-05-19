# EnrolLicenseEnrolUserRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | Id of the course | [default to null]
**Instanceid** | Pointer to **int32** | Instance id oflicenseenrolment plugin. | [optional] [default to 0]
**Password** | Pointer to **string** | Enrolment key | [optional] [default to ""]

## Methods

### NewEnrolLicenseEnrolUserRequest

`func NewEnrolLicenseEnrolUserRequest(courseid int32, ) *EnrolLicenseEnrolUserRequest`

NewEnrolLicenseEnrolUserRequest instantiates a new EnrolLicenseEnrolUserRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnrolLicenseEnrolUserRequestWithDefaults

`func NewEnrolLicenseEnrolUserRequestWithDefaults() *EnrolLicenseEnrolUserRequest`

NewEnrolLicenseEnrolUserRequestWithDefaults instantiates a new EnrolLicenseEnrolUserRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *EnrolLicenseEnrolUserRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *EnrolLicenseEnrolUserRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *EnrolLicenseEnrolUserRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetInstanceid

`func (o *EnrolLicenseEnrolUserRequest) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *EnrolLicenseEnrolUserRequest) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *EnrolLicenseEnrolUserRequest) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.

### HasInstanceid

`func (o *EnrolLicenseEnrolUserRequest) HasInstanceid() bool`

HasInstanceid returns a boolean if a field has been set.

### GetPassword

`func (o *EnrolLicenseEnrolUserRequest) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *EnrolLicenseEnrolUserRequest) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *EnrolLicenseEnrolUserRequest) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *EnrolLicenseEnrolUserRequest) HasPassword() bool`

HasPassword returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


