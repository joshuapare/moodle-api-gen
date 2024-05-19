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
    /// CoreCustomfieldReloadTemplateRequest
    /// </summary>
    [DataContract(Name = "core_customfield_reload_template_request")]
    public partial class CoreCustomfieldReloadTemplateRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCustomfieldReloadTemplateRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCustomfieldReloadTemplateRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCustomfieldReloadTemplateRequest" /> class.
        /// </summary>
        /// <param name="area">area (required).</param>
        /// <param name="component">component (required).</param>
        /// <param name="itemid">itemid (required).</param>
        public CoreCustomfieldReloadTemplateRequest(string area = default(string), string component = default(string), int itemid = default(int))
        {
            // to ensure "area" is required (not null)
            if (area == null)
            {
                throw new ArgumentNullException("area is a required property for CoreCustomfieldReloadTemplateRequest and cannot be null");
            }
            this.Area = area;
            // to ensure "component" is required (not null)
            if (component == null)
            {
                throw new ArgumentNullException("component is a required property for CoreCustomfieldReloadTemplateRequest and cannot be null");
            }
            this.Component = component;
            this.Itemid = itemid;
        }

        /// <summary>
        /// area
        /// </summary>
        /// <value>area</value>
        [DataMember(Name = "area", IsRequired = true, EmitDefaultValue = true)]
        public string Area { get; set; }

        /// <summary>
        /// component
        /// </summary>
        /// <value>component</value>
        [DataMember(Name = "component", IsRequired = true, EmitDefaultValue = true)]
        public string Component { get; set; }

        /// <summary>
        /// itemid
        /// </summary>
        /// <value>itemid</value>
        [DataMember(Name = "itemid", IsRequired = true, EmitDefaultValue = true)]
        public int Itemid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCustomfieldReloadTemplateRequest {\n");
            sb.Append("  Area: ").Append(Area).Append("\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
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