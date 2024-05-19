# EnrolSelfGetInstanceInfo200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | id of course | 
**Enrolpassword** | Pointer to **string** | password required for enrolment | [optional] 
**Id** | **int32** | id of course enrolment instance | 
**Name** | **string** | name of enrolment plugin | 
**Status** | **string** | status of enrolment plugin | 
**Type** | **string** | type of enrolment plugin | 

## Methods

### NewEnrolSelfGetInstanceInfo200Response

`func NewEnrolSelfGetInstanceInfo200Response(courseid int32, id int32, name string, status string, type_ string, ) *EnrolSelfGetInstanceInfo200Response`

NewEnrolSelfGetInstanceInfo200Response instantiates a new EnrolSelfGetInstanceInfo200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEnrolSelfGetInstanceInfo200ResponseWithDefaults

`func NewEnrolSelfGetInstanceInfo200ResponseWithDefaults() *EnrolSelfGetInstanceInfo200Response`

NewEnrolSelfGetInstanceInfo200ResponseWithDefaults instantiates a new EnrolSelfGetInstanceInfo200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *EnrolSelfGetInstanceInfo200Response) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *EnrolSelfGetInstanceInfo200Response) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *EnrolSelfGetInstanceInfo200Response) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetEnrolpassword

`func (o *EnrolSelfGetInstanceInfo200Response) GetEnrolpassword() string`

GetEnrolpassword returns the Enrolpassword field if non-nil, zero value otherwise.

### GetEnrolpasswordOk

`func (o *EnrolSelfGetInstanceInfo200Response) GetEnrolpasswordOk() (*string, bool)`

GetEnrolpasswordOk returns a tuple with the Enrolpassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnrolpassword

`func (o *EnrolSelfGetInstanceInfo200Response) SetEnrolpassword(v string)`

SetEnrolpassword sets Enrolpassword field to given value.

### HasEnrolpassword

`func (o *EnrolSelfGetInstanceInfo200Response) HasEnrolpassword() bool`

HasEnrolpassword returns a boolean if a field has been set.

### GetId

`func (o *EnrolSelfGetInstanceInfo200Response) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EnrolSelfGetInstanceInfo200Response) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EnrolSelfGetInstanceInfo200Response) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *EnrolSelfGetInstanceInfo200Response) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EnrolSelfGetInstanceInfo200Response) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EnrolSelfGetInstanceInfo200Response) SetName(v string)`

SetName sets Name field to given value.


### GetStatus

`func (o *EnrolSelfGetInstanceInfo200Response) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *EnrolSelfGetInstanceInfo200Response) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *EnrolSelfGetInstanceInfo200Response) SetStatus(v string)`

SetStatus sets Status field to given value.


### GetType

`func (o *EnrolSelfGetInstanceInfo200Response) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *EnrolSelfGetInstanceInfo200Response) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *EnrolSelfGetInstanceInfo200Response) SetType(v string)`

SetType sets Type field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


