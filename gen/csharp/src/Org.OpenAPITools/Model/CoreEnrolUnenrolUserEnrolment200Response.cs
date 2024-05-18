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
    /// CoreEnrolUnenrolUserEnrolment200Response
    /// </summary>
    [DataContract(Name = "core_enrol_unenrol_user_enrolment_200_response")]
    public partial class CoreEnrolUnenrolUserEnrolment200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreEnrolUnenrolUserEnrolment200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreEnrolUnenrolUserEnrolment200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreEnrolUnenrolUserEnrolment200Response" /> class.
        /// </summary>
        /// <param name="errors">errors (required).</param>
        /// <param name="result">True if the user&#39;s enrolment was successfully updated (required).</param>
        public CoreEnrolUnenrolUserEnrolment200Response(List<CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner> errors = default(List<CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner>), bool result = default(bool))
        {
            // to ensure "errors" is required (not null)
            if (errors == null)
            {
                throw new ArgumentNullException("errors is a required property for CoreEnrolUnenrolUserEnrolment200Response and cannot be null");
            }
            this.Errors = errors;
            this.Result = result;
        }

        /// <summary>
        /// Gets or Sets Errors
        /// </summary>
        [DataMember(Name = "errors", IsRequired = true, EmitDefaultValue = true)]
        public List<CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner> Errors { get; set; }

        /// <summary>
        /// True if the user&#39;s enrolment was successfully updated
        /// </summary>
        /// <value>True if the user&#39;s enrolment was successfully updated</value>
        [DataMember(Name = "result", IsRequired = true, EmitDefaultValue = true)]
        public bool Result { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreEnrolUnenrolUserEnrolment200Response {\n");
            sb.Append("  Errors: ").Append(Errors).Append("\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
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
