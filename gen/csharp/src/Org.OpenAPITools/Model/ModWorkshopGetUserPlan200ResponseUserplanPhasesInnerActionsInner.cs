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
    /// ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner
    /// </summary>
    [DataContract(Name = "mod_workshop_get_user_plan_200_response_userplan_phases_inner_actions_inner")]
    public partial class ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner" /> class.
        /// </summary>
        /// <param name="label">Action label. (default to &quot;null&quot;).</param>
        /// <param name="method">Get or post. (default to &quot;null&quot;).</param>
        /// <param name="type">Action type. (default to &quot;null&quot;).</param>
        /// <param name="url">Link to action. (default to &quot;null&quot;).</param>
        public ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner(string label = @"null", string method = @"null", string type = @"null", string url = @"null")
        {
            // use default value if no "label" provided
            this.Label = label ?? @"null";
            // use default value if no "method" provided
            this.Method = method ?? @"null";
            // use default value if no "type" provided
            this.Type = type ?? @"null";
            // use default value if no "url" provided
            this.Url = url ?? @"null";
        }

        /// <summary>
        /// Action label.
        /// </summary>
        /// <value>Action label.</value>
        [DataMember(Name = "label", EmitDefaultValue = false)]
        public string Label { get; set; }

        /// <summary>
        /// Get or post.
        /// </summary>
        /// <value>Get or post.</value>
        [DataMember(Name = "method", EmitDefaultValue = false)]
        public string Method { get; set; }

        /// <summary>
        /// Action type.
        /// </summary>
        /// <value>Action type.</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Link to action.
        /// </summary>
        /// <value>Link to action.</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner {\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
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