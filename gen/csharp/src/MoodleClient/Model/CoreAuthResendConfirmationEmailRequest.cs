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
    /// CoreAuthResendConfirmationEmailRequest
    /// </summary>
    [DataContract(Name = "core_auth_resend_confirmation_email_request")]
    public partial class CoreAuthResendConfirmationEmailRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreAuthResendConfirmationEmailRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreAuthResendConfirmationEmailRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreAuthResendConfirmationEmailRequest" /> class.
        /// </summary>
        /// <param name="password">Plain text password. (required) (default to &quot;null&quot;).</param>
        /// <param name="redirect">Redirect the user to this site url after confirmation. (default to &quot;&quot;).</param>
        /// <param name="username">Username. (required) (default to &quot;null&quot;).</param>
        public CoreAuthResendConfirmationEmailRequest(string password = @"null", string redirect = @"", string username = @"null")
        {
            // to ensure "password" is required (not null)
            if (password == null)
            {
                throw new ArgumentNullException("password is a required property for CoreAuthResendConfirmationEmailRequest and cannot be null");
            }
            this.Password = password;
            // to ensure "username" is required (not null)
            if (username == null)
            {
                throw new ArgumentNullException("username is a required property for CoreAuthResendConfirmationEmailRequest and cannot be null");
            }
            this.Username = username;
            // use default value if no "redirect" provided
            this.Redirect = redirect ?? @"";
        }

        /// <summary>
        /// Plain text password.
        /// </summary>
        /// <value>Plain text password.</value>
        [DataMember(Name = "password", IsRequired = true, EmitDefaultValue = true)]
        public string Password { get; set; }

        /// <summary>
        /// Redirect the user to this site url after confirmation.
        /// </summary>
        /// <value>Redirect the user to this site url after confirmation.</value>
        [DataMember(Name = "redirect", EmitDefaultValue = false)]
        public string Redirect { get; set; }

        /// <summary>
        /// Username.
        /// </summary>
        /// <value>Username.</value>
        [DataMember(Name = "username", IsRequired = true, EmitDefaultValue = true)]
        public string Username { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreAuthResendConfirmationEmailRequest {\n");
            sb.Append("  Password: ").Append(Password).Append("\n");
            sb.Append("  Redirect: ").Append(Redirect).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
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
