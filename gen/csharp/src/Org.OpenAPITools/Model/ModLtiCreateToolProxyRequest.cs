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
    /// ModLtiCreateToolProxyRequest
    /// </summary>
    [DataContract(Name = "mod_lti_create_tool_proxy_request")]
    public partial class ModLtiCreateToolProxyRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiCreateToolProxyRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLtiCreateToolProxyRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLtiCreateToolProxyRequest" /> class.
        /// </summary>
        /// <param name="capabilityoffered">capabilityoffered.</param>
        /// <param name="name">Tool proxy name (default to &quot;&quot;).</param>
        /// <param name="regurl">Tool proxy registration URL (required) (default to &quot;null&quot;).</param>
        /// <param name="serviceoffered">serviceoffered.</param>
        public ModLtiCreateToolProxyRequest(List<Object> capabilityoffered = default(List<Object>), string name = @"", string regurl = @"null", List<Object> serviceoffered = default(List<Object>))
        {
            // to ensure "regurl" is required (not null)
            if (regurl == null)
            {
                throw new ArgumentNullException("regurl is a required property for ModLtiCreateToolProxyRequest and cannot be null");
            }
            this.Regurl = regurl;
            this.Capabilityoffered = capabilityoffered;
            // use default value if no "name" provided
            this.Name = name ?? @"";
            this.Serviceoffered = serviceoffered;
        }

        /// <summary>
        /// Gets or Sets Capabilityoffered
        /// </summary>
        [DataMember(Name = "capabilityoffered", EmitDefaultValue = false)]
        public List<Object> Capabilityoffered { get; set; }

        /// <summary>
        /// Tool proxy name
        /// </summary>
        /// <value>Tool proxy name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Tool proxy registration URL
        /// </summary>
        /// <value>Tool proxy registration URL</value>
        [DataMember(Name = "regurl", IsRequired = true, EmitDefaultValue = true)]
        public string Regurl { get; set; }

        /// <summary>
        /// Gets or Sets Serviceoffered
        /// </summary>
        [DataMember(Name = "serviceoffered", EmitDefaultValue = false)]
        public List<Object> Serviceoffered { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLtiCreateToolProxyRequest {\n");
            sb.Append("  Capabilityoffered: ").Append(Capabilityoffered).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Regurl: ").Append(Regurl).Append("\n");
            sb.Append("  Serviceoffered: ").Append(Serviceoffered).Append("\n");
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