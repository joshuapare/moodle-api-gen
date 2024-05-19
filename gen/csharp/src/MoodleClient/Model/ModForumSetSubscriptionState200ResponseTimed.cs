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
    /// ModForumSetSubscriptionState200ResponseTimed
    /// </summary>
    [DataContract(Name = "mod_forum_set_subscription_state_200_response_timed")]
    public partial class ModForumSetSubscriptionState200ResponseTimed : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumSetSubscriptionState200ResponseTimed" /> class.
        /// </summary>
        /// <param name="istimed">istimed.</param>
        /// <param name="visible">visible.</param>
        public ModForumSetSubscriptionState200ResponseTimed(bool istimed = default(bool), bool visible = default(bool))
        {
            this.Istimed = istimed;
            this.Visible = visible;
        }

        /// <summary>
        /// istimed
        /// </summary>
        /// <value>istimed</value>
        [DataMember(Name = "istimed", EmitDefaultValue = true)]
        public bool Istimed { get; set; }

        /// <summary>
        /// visible
        /// </summary>
        /// <value>visible</value>
        [DataMember(Name = "visible", EmitDefaultValue = true)]
        public bool Visible { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumSetSubscriptionState200ResponseTimed {\n");
            sb.Append("  Istimed: ").Append(Istimed).Append("\n");
            sb.Append("  Visible: ").Append(Visible).Append("\n");
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
