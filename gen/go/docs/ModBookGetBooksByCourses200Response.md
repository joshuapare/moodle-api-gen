# ModBookGetBooksByCourses200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Books** | [**[]ModBookGetBooksByCourses200ResponseBooksInner**](ModBookGetBooksByCourses200ResponseBooksInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModBookGetBooksByCourses200Response

`func NewModBookGetBooksByCourses200Response(books []ModBookGetBooksByCourses200ResponseBooksInner, ) *ModBookGetBooksByCourses200Response`

NewModBookGetBooksByCourses200Response instantiates a new ModBookGetBooksByCourses200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModBookGetBooksByCourses200ResponseWithDefaults

`func NewModBookGetBooksByCourses200ResponseWithDefaults() *ModBookGetBooksByCourses200Response`

NewModBookGetBooksByCourses200ResponseWithDefaults instantiates a new ModBookGetBooksByCourses200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBooks

`func (o *ModBookGetBooksByCourses200Response) GetBooks() []ModBookGetBooksByCourses200ResponseBooksInner`

GetBooks returns the Books field if non-nil, zero value otherwise.

### GetBooksOk

`func (o *ModBookGetBooksByCourses200Response) GetBooksOk() (*[]ModBookGetBooksByCourses200ResponseBooksInner, bool)`

GetBooksOk returns a tuple with the Books field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBooks

`func (o *ModBookGetBooksByCourses200Response) SetBooks(v []ModBookGetBooksByCourses200ResponseBooksInner)`

SetBooks sets Books field to given value.


### GetWarnings

`func (o *ModBookGetBooksByCourses200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModBookGetBooksByCourses200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModBookGetBooksByCourses200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModBookGetBooksByCourses200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


