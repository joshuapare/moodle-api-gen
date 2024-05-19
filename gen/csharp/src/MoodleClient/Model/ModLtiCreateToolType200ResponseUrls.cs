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
    /// ModLtiCreateToolType200ResponseUrls
    /// </summary>
    [DataContract(Name = "mod_lti_create_tool_type_200_response_urls")]
    public partial class ModLtiCreateToolType200ResponseUrls : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiCreateToolType200ResponseUrls" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLtiCreateToolType200ResponseUrls() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiCreateToolType200ResponseUrls" /> class.
        /// </summary>
        /// <param name="accesstoken">Access Token URL (required) (default to &quot;null&quot;).</param>
        /// <param name="authrequest">Authorisation Request URL (required) (default to &quot;null&quot;).</param>
        /// <param name="course">Tool type edit URL (default to &quot;null&quot;).</param>
        /// <param name="edit">Tool type edit URL (required).</param>
        /// <param name="icon">Tool type icon URL (required) (default to &quot;null&quot;).</param>
        /// <param name="publickeyset">Public Keyset URL (required) (default to &quot;null&quot;).</param>
        public ModLtiCreateToolType200ResponseUrls(string accesstoken = @"null", string authrequest = @"null", string course = @"null", string edit = default(string), string icon = @"null", string publickeyset = @"null")
        {
            // to ensure "accesstoken" is required (not null)
            if (accesstoken == null)
            {
                throw new ArgumentNullException("accesstoken is a required property for ModLtiCreateToolType200ResponseUrls and cannot be null");
            }
            this.Accesstoken = accesstoken;
            // to ensure "authrequest" is required (not null)
            if (authrequest == null)
            {
                throw new ArgumentNullException("authrequest is a required property for ModLtiCreateToolType200ResponseUrls and cannot be null");
            }
            this.Authrequest = authrequest;
            // to ensure "edit" is required (not null)
            if (edit == null)
            {
                throw new ArgumentNullException("edit is a required property for ModLtiCreateToolType200ResponseUrls and cannot be null");
            }
            this.Edit = edit;
            // to ensure "icon" is required (not null)
            if (icon == null)
            {
                throw new ArgumentNullException("icon is a required property for ModLtiCreateToolType200ResponseUrls and cannot be null");
            }
            this.Icon = icon;
            // to ensure "publickeyset" is required (not null)
            if (publickeyset == null)
            {
                throw new ArgumentNullException("publickeyset is a required property for ModLtiCreateToolType200ResponseUrls and cannot be null");
            }
            this.Publickeyset = publickeyset;
            // use default value if no "course" provided
            this.Course = course ?? @"null";
        }

        /// <summary>
        /// Access Token URL
        /// </summary>
        /// <value>Access Token URL</value>
        [DataMember(Name = "accesstoken", IsRequired = true, EmitDefaultValue = true)]
        public string Accesstoken { get; set; }

        /// <summary>
        /// Authorisation Request URL
        /// </summary>
        /// <value>Authorisation Request URL</value>
        [DataMember(Name = "authrequest", IsRequired = true, EmitDefaultValue = true)]
        public string Authrequest { get; set; }

        /// <summary>
        /// Tool type edit URL
        /// </summary>
        /// <value>Tool type edit URL</value>
        [DataMember(Name = "course", EmitDefaultValue = false)]
        public string Course { get; set; }

        /// <summary>
        /// Tool type edit URL
        /// </summary>
        /// <value>Tool type edit URL</value>
        [DataMember(Name = "edit", IsRequired = true, EmitDefaultValue = true)]
        public string Edit { get; set; }

        /// <summary>
        /// Tool type icon URL
        /// </summary>
        /// <value>Tool type icon URL</value>
        [DataMember(Name = "icon", IsRequired = true, EmitDefaultValue = true)]
        public string Icon { get; set; }

        /// <summary>
        /// Public Keyset URL
        /// </summary>
        /// <value>Public Keyset URL</value>
        [DataMember(Name = "publickeyset", IsRequired = true, EmitDefaultValue = true)]
        public string Publickeyset { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLtiCreateToolType200ResponseUrls {\n");
            sb.Append("  Accesstoken: ").Append(Accesstoken).Append("\n");
            sb.Append("  Authrequest: ").Append(Authrequest).Append("\n");
            sb.Append("  Course: ").Append(Course).Append("\n");
            sb.Append("  Edit: ").Append(Edit).Append("\n");
            sb.Append("  Icon: ").Append(Icon).Append("\n");
            sb.Append("  Publickeyset: ").Append(Publickeyset).Append("\n");
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
