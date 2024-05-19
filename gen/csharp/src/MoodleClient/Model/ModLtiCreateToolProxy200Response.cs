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
    /// ModLtiCreateToolProxy200Response
    /// </summary>
    [DataContract(Name = "mod_lti_create_tool_proxy_200_response")]
    public partial class ModLtiCreateToolProxy200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiCreateToolProxy200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLtiCreateToolProxy200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiCreateToolProxy200Response" /> class.
        /// </summary>
        /// <param name="capabilityoffered">Tool proxy capabilities offered (required) (default to &quot;null&quot;).</param>
        /// <param name="guid">Tool proxy globally unique identifier (required) (default to &quot;null&quot;).</param>
        /// <param name="id">Tool proxy id (required) (default to null).</param>
        /// <param name="name">Tool proxy name (required) (default to &quot;null&quot;).</param>
        /// <param name="regurl">Tool proxy registration URL (required).</param>
        /// <param name="secret">Tool proxy shared secret (required) (default to &quot;null&quot;).</param>
        /// <param name="serviceoffered">Tool proxy services offered (required) (default to &quot;null&quot;).</param>
        /// <param name="state">Tool proxy state (required) (default to null).</param>
        /// <param name="timecreated">Tool proxy time created (required) (default to null).</param>
        /// <param name="timemodified">Tool proxy modified (required) (default to null).</param>
        /// <param name="toolproxy">Tool proxy (required) (default to &quot;null&quot;).</param>
        /// <param name="vendorcode">Tool proxy consumer code (required) (default to &quot;null&quot;).</param>
        public ModLtiCreateToolProxy200Response(string capabilityoffered = @"null", string guid = @"null", int id = null, string name = @"null", string regurl = default(string), string secret = @"null", string serviceoffered = @"null", int state = null, int timecreated = null, int timemodified = null, string toolproxy = @"null", string vendorcode = @"null")
        {
            // to ensure "capabilityoffered" is required (not null)
            if (capabilityoffered == null)
            {
                throw new ArgumentNullException("capabilityoffered is a required property for ModLtiCreateToolProxy200Response and cannot be null");
            }
            this.Capabilityoffered = capabilityoffered;
            // to ensure "guid" is required (not null)
            if (guid == null)
            {
                throw new ArgumentNullException("guid is a required property for ModLtiCreateToolProxy200Response and cannot be null");
            }
            this.Guid = guid;
            this.Id = id;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for ModLtiCreateToolProxy200Response and cannot be null");
            }
            this.Name = name;
            // to ensure "regurl" is required (not null)
            if (regurl == null)
            {
                throw new ArgumentNullException("regurl is a required property for ModLtiCreateToolProxy200Response and cannot be null");
            }
            this.Regurl = regurl;
            // to ensure "secret" is required (not null)
            if (secret == null)
            {
                throw new ArgumentNullException("secret is a required property for ModLtiCreateToolProxy200Response and cannot be null");
            }
            this.Secret = secret;
            // to ensure "serviceoffered" is required (not null)
            if (serviceoffered == null)
            {
                throw new ArgumentNullException("serviceoffered is a required property for ModLtiCreateToolProxy200Response and cannot be null");
            }
            this.Serviceoffered = serviceoffered;
            this.State = state;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            // to ensure "toolproxy" is required (not null)
            if (toolproxy == null)
            {
                throw new ArgumentNullException("toolproxy is a required property for ModLtiCreateToolProxy200Response and cannot be null");
            }
            this.Toolproxy = toolproxy;
            // to ensure "vendorcode" is required (not null)
            if (vendorcode == null)
            {
                throw new ArgumentNullException("vendorcode is a required property for ModLtiCreateToolProxy200Response and cannot be null");
            }
            this.Vendorcode = vendorcode;
        }

        /// <summary>
        /// Tool proxy capabilities offered
        /// </summary>
        /// <value>Tool proxy capabilities offered</value>
        [DataMember(Name = "capabilityoffered", IsRequired = true, EmitDefaultValue = true)]
        public string Capabilityoffered { get; set; }

        /// <summary>
        /// Tool proxy globally unique identifier
        /// </summary>
        /// <value>Tool proxy globally unique identifier</value>
        [DataMember(Name = "guid", IsRequired = true, EmitDefaultValue = true)]
        public string Guid { get; set; }

        /// <summary>
        /// Tool proxy id
        /// </summary>
        /// <value>Tool proxy id</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// Tool proxy name
        /// </summary>
        /// <value>Tool proxy name</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Tool proxy registration URL
        /// </summary>
        /// <value>Tool proxy registration URL</value>
        [DataMember(Name = "regurl", IsRequired = true, EmitDefaultValue = true)]
        public string Regurl { get; set; }

        /// <summary>
        /// Tool proxy shared secret
        /// </summary>
        /// <value>Tool proxy shared secret</value>
        [DataMember(Name = "secret", IsRequired = true, EmitDefaultValue = true)]
        public string Secret { get; set; }

        /// <summary>
        /// Tool proxy services offered
        /// </summary>
        /// <value>Tool proxy services offered</value>
        [DataMember(Name = "serviceoffered", IsRequired = true, EmitDefaultValue = true)]
        public string Serviceoffered { get; set; }

        /// <summary>
        /// Tool proxy state
        /// </summary>
        /// <value>Tool proxy state</value>
        [DataMember(Name = "state", IsRequired = true, EmitDefaultValue = true)]
        public int State { get; set; }

        /// <summary>
        /// Tool proxy time created
        /// </summary>
        /// <value>Tool proxy time created</value>
        [DataMember(Name = "timecreated", IsRequired = true, EmitDefaultValue = true)]
        public int Timecreated { get; set; }

        /// <summary>
        /// Tool proxy modified
        /// </summary>
        /// <value>Tool proxy modified</value>
        [DataMember(Name = "timemodified", IsRequired = true, EmitDefaultValue = true)]
        public int Timemodified { get; set; }

        /// <summary>
        /// Tool proxy
        /// </summary>
        /// <value>Tool proxy</value>
        [DataMember(Name = "toolproxy", IsRequired = true, EmitDefaultValue = true)]
        public string Toolproxy { get; set; }

        /// <summary>
        /// Tool proxy consumer code
        /// </summary>
        /// <value>Tool proxy consumer code</value>
        [DataMember(Name = "vendorcode", IsRequired = true, EmitDefaultValue = true)]
        public string Vendorcode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLtiCreateToolProxy200Response {\n");
            sb.Append("  Capabilityoffered: ").Append(Capabilityoffered).Append("\n");
            sb.Append("  Guid: ").Append(Guid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Regurl: ").Append(Regurl).Append("\n");
            sb.Append("  Secret: ").Append(Secret).Append("\n");
            sb.Append("  Serviceoffered: ").Append(Serviceoffered).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Toolproxy: ").Append(Toolproxy).Append("\n");
            sb.Append("  Vendorcode: ").Append(Vendorcode).Append("\n");
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
