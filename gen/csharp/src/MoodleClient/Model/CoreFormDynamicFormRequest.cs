/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// CoreFormDynamicFormRequest
    /// </summary>
    [DataContract(Name = "core_form_dynamic_form_request")]
    public partial class CoreFormDynamicFormRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreFormDynamicFormRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreFormDynamicFormRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreFormDynamicFormRequest" /> class.
        /// </summary>
        /// <param name="form">Form class (required) (default to &quot;null&quot;).</param>
        /// <param name="formdata">url-encoded form data (required) (default to &quot;null&quot;).</param>
        public CoreFormDynamicFormRequest(string form = @"null", string formdata = @"null")
        {
            // to ensure "form" is required (not null)
            if (form == null)
            {
                throw new ArgumentNullException("form is a required property for CoreFormDynamicFormRequest and cannot be null");
            }
            this.Form = form;
            // to ensure "formdata" is required (not null)
            if (formdata == null)
            {
                throw new ArgumentNullException("formdata is a required property for CoreFormDynamicFormRequest and cannot be null");
            }
            this.Formdata = formdata;
        }

        /// <summary>
        /// Form class
        /// </summary>
        /// <value>Form class</value>
        [DataMember(Name = "form", IsRequired = true, EmitDefaultValue = true)]
        public string Form { get; set; }

        /// <summary>
        /// url-encoded form data
        /// </summary>
        /// <value>url-encoded form data</value>
        [DataMember(Name = "formdata", IsRequired = true, EmitDefaultValue = true)]
        public string Formdata { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreFormDynamicFormRequest {\n");
            sb.Append("  Form: ").Append(Form).Append("\n");
            sb.Append("  Formdata: ").Append(Formdata).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
