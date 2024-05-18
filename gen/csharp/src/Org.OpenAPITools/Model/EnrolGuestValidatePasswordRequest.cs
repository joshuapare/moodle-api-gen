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
    /// EnrolGuestValidatePasswordRequest
    /// </summary>
    [DataContract(Name = "enrol_guest_validate_password_request")]
    public partial class EnrolGuestValidatePasswordRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EnrolGuestValidatePasswordRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EnrolGuestValidatePasswordRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EnrolGuestValidatePasswordRequest" /> class.
        /// </summary>
        /// <param name="instanceid">instance id of guest enrolment plugin (required) (default to null).</param>
        /// <param name="password">the course password (required) (default to &quot;null&quot;).</param>
        public EnrolGuestValidatePasswordRequest(int instanceid = null, string password = @"null")
        {
            this.Instanceid = instanceid;
            // to ensure "password" is required (not null)
            if (password == null)
            {
                throw new ArgumentNullException("password is a required property for EnrolGuestValidatePasswordRequest and cannot be null");
            }
            this.Password = password;
        }

        /// <summary>
        /// instance id of guest enrolment plugin
        /// </summary>
        /// <value>instance id of guest enrolment plugin</value>
        [DataMember(Name = "instanceid", IsRequired = true, EmitDefaultValue = true)]
        public int Instanceid { get; set; }

        /// <summary>
        /// the course password
        /// </summary>
        /// <value>the course password</value>
        [DataMember(Name = "password", IsRequired = true, EmitDefaultValue = true)]
        public string Password { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EnrolGuestValidatePasswordRequest {\n");
            sb.Append("  Instanceid: ").Append(Instanceid).Append("\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
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
