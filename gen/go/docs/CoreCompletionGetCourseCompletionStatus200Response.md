# CoreCompletionGetCourseCompletionStatus200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Completionstatus** | [**CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus**](CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCompletionGetCourseCompletionStatus200Response

`func NewCoreCompletionGetCourseCompletionStatus200Response(completionstatus CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus, ) *CoreCompletionGetCourseCompletionStatus200Response`

NewCoreCompletionGetCourseCompletionStatus200Response instantiates a new CoreCompletionGetCourseCompletionStatus200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCompletionGetCourseCompletionStatus200ResponseWithDefaults

`func NewCoreCompletionGetCourseCompletionStatus200ResponseWithDefaults() *CoreCompletionGetCourseCompletionStatus200Response`

NewCoreCompletionGetCourseCompletionStatus200ResponseWithDefaults instantiates a new CoreCompletionGetCourseCompletionStatus200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompletionstatus

`func (o *CoreCompletionGetCourseCompletionStatus200Response) GetCompletionstatus() CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus`

GetCompletionstatus returns the Completionstatus field if non-nil, zero value otherwise.

### GetCompletionstatusOk

`func (o *CoreCompletionGetCourseCompletionStatus200Response) GetCompletionstatusOk() (*CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus, bool)`

GetCompletionstatusOk returns a tuple with the Completionstatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompletionstatus

`func (o *CoreCompletionGetCourseCompletionStatus200Response) SetCompletionstatus(v CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus)`

SetCompletionstatus sets Completionstatus field to given value.


### GetWarnings

`func (o *CoreCompletionGetCourseCompletionStatus200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCompletionGetCourseCompletionStatus200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCompletionGetCourseCompletionStatus200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCompletionGetCourseCompletionStatus200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


