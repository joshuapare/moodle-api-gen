# CoreGradesGetEnrolledUsersForSelector200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Users** | [**[]CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner**](CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreGradesGetEnrolledUsersForSelector200Response

`func NewCoreGradesGetEnrolledUsersForSelector200Response(users []CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner, ) *CoreGradesGetEnrolledUsersForSelector200Response`

NewCoreGradesGetEnrolledUsersForSelector200Response instantiates a new CoreGradesGetEnrolledUsersForSelector200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesGetEnrolledUsersForSelector200ResponseWithDefaults

`func NewCoreGradesGetEnrolledUsersForSelector200ResponseWithDefaults() *CoreGradesGetEnrolledUsersForSelector200Response`

NewCoreGradesGetEnrolledUsersForSelector200ResponseWithDefaults instantiates a new CoreGradesGetEnrolledUsersForSelector200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUsers

`func (o *CoreGradesGetEnrolledUsersForSelector200Response) GetUsers() []CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner`

GetUsers returns the Users field if non-nil, zero value otherwise.

### GetUsersOk

`func (o *CoreGradesGetEnrolledUsersForSelector200Response) GetUsersOk() (*[]CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner, bool)`

GetUsersOk returns a tuple with the Users field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsers

`func (o *CoreGradesGetEnrolledUsersForSelector200Response) SetUsers(v []CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner)`

SetUsers sets Users field to given value.


### GetWarnings

`func (o *CoreGradesGetEnrolledUsersForSelector200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreGradesGetEnrolledUsersForSelector200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreGradesGetEnrolledUsersForSelector200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreGradesGetEnrolledUsersForSelector200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


