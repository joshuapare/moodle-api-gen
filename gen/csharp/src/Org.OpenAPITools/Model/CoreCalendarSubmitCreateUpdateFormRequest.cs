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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// CoreCalendarSubmitCreateUpdateFormRequest
    /// </summary>
    [DataContract(Name = "core_calendar_submit_create_update_form_request")]
    public partial class CoreCalendarSubmitCreateUpdateFormRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarSubmitCreateUpdateFormRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCalendarSubmitCreateUpdateFormRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCalendarSubmitCreateUpdateFormRequest" /> class.
        /// </summary>
        /// <param name="formdata">The data from the event form (required) (default to &quot;null&quot;).</param>
        public CoreCalendarSubmitCreateUpdateFormRequest(string formdata = @"null")
        {
            // to ensure "formdata" is required (not null)
            if (formdata == null)
            {
                throw new ArgumentNullException("formdata is a required property for CoreCalendarSubmitCreateUpdateFormRequest and cannot be null");
            }
            this.Formdata = formdata;
        }

        /// <summary>
        /// The data from the event form
        /// </summary>
        /// <value>The data from the event form</value>
        [DataMember(Name = "formdata", IsRequired = true, EmitDefaultValue = true)]
        public string Formdata { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCalendarSubmitCreateUpdateFormRequest {\n");
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
