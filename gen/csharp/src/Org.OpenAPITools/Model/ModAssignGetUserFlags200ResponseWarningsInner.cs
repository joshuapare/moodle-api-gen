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
    /// warning
    /// </summary>
    [DataContract(Name = "mod_assign_get_user_flags_200_response_warnings_inner")]
    public partial class ModAssignGetUserFlags200ResponseWarningsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetUserFlags200ResponseWarningsInner" /> class.
        /// </summary>
        /// <param name="item">item is always &#39;assignment&#39;.</param>
        /// <param name="itemid">when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id.</param>
        /// <param name="message">untranslated english message to explain the warning.</param>
        /// <param name="warningcode">errorcode can be 3 (no user flags found) or 1 (no permission to get user flags) (default to &quot;null&quot;).</param>
        public ModAssignGetUserFlags200ResponseWarningsInner(string item = default(string), int itemid = default(int), string message = default(string), string warningcode = @"null")
        {
            this.Item = item;
            this.Itemid = itemid;
            this.Message = message;
            // use default value if no "warningcode" provided
            this.Warningcode = warningcode ?? @"null";
        }

        /// <summary>
        /// item is always &#39;assignment&#39;
        /// </summary>
        /// <value>item is always &#39;assignment&#39;</value>
        [DataMember(Name = "item", EmitDefaultValue = false)]
        public string Item { get; set; }

        /// <summary>
        /// when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id
        /// </summary>
        /// <value>when errorcode is 3 then itemid is an assignment id. When errorcode is 1, itemid is a course module id</value>
        [DataMember(Name = "itemid", EmitDefaultValue = false)]
        public int Itemid { get; set; }

        /// <summary>
        /// untranslated english message to explain the warning
        /// </summary>
        /// <value>untranslated english message to explain the warning</value>
        [DataMember(Name = "message", EmitDefaultValue = false)]
        public string Message { get; set; }

        /// <summary>
        /// errorcode can be 3 (no user flags found) or 1 (no permission to get user flags)
        /// </summary>
        /// <value>errorcode can be 3 (no user flags found) or 1 (no permission to get user flags)</value>
        [DataMember(Name = "warningcode", EmitDefaultValue = false)]
        public string Warningcode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignGetUserFlags200ResponseWarningsInner {\n");
            sb.Append("  Item: ").Append(Item).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  Warningcode: ").Append(Warningcode).Append("\n");
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
