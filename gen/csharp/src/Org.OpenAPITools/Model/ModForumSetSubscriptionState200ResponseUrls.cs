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
    /// ModForumSetSubscriptionState200ResponseUrls
    /// </summary>
    [DataContract(Name = "mod_forum_set_subscription_state_200_response_urls")]
    public partial class ModForumSetSubscriptionState200ResponseUrls : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumSetSubscriptionState200ResponseUrls" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModForumSetSubscriptionState200ResponseUrls() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModForumSetSubscriptionState200ResponseUrls" /> class.
        /// </summary>
        /// <param name="markasread">markasread (required).</param>
        /// <param name="pin">pin.</param>
        /// <param name="subscribe">subscribe (required).</param>
        /// <param name="view">view (required).</param>
        /// <param name="viewfirstunread">viewfirstunread.</param>
        /// <param name="viewlatest">viewlatest.</param>
        public ModForumSetSubscriptionState200ResponseUrls(string markasread = default(string), string pin = default(string), string subscribe = default(string), string view = default(string), string viewfirstunread = default(string), string viewlatest = default(string))
        {
            // to ensure "markasread" is required (not null)
            if (markasread == null)
            {
                throw new ArgumentNullException("markasread is a required property for ModForumSetSubscriptionState200ResponseUrls and cannot be null");
            }
            this.Markasread = markasread;
            // to ensure "subscribe" is required (not null)
            if (subscribe == null)
            {
                throw new ArgumentNullException("subscribe is a required property for ModForumSetSubscriptionState200ResponseUrls and cannot be null");
            }
            this.Subscribe = subscribe;
            // to ensure "view" is required (not null)
            if (view == null)
            {
                throw new ArgumentNullException("view is a required property for ModForumSetSubscriptionState200ResponseUrls and cannot be null");
            }
            this.View = view;
            this.Pin = pin;
            this.Viewfirstunread = viewfirstunread;
            this.Viewlatest = viewlatest;
        }

        /// <summary>
        /// markasread
        /// </summary>
        /// <value>markasread</value>
        [DataMember(Name = "markasread", IsRequired = true, EmitDefaultValue = true)]
        public string Markasread { get; set; }

        /// <summary>
        /// pin
        /// </summary>
        /// <value>pin</value>
        [DataMember(Name = "pin", EmitDefaultValue = false)]
        public string Pin { get; set; }

        /// <summary>
        /// subscribe
        /// </summary>
        /// <value>subscribe</value>
        [DataMember(Name = "subscribe", IsRequired = true, EmitDefaultValue = true)]
        public string Subscribe { get; set; }

        /// <summary>
        /// view
        /// </summary>
        /// <value>view</value>
        [DataMember(Name = "view", IsRequired = true, EmitDefaultValue = true)]
        public string View { get; set; }

        /// <summary>
        /// viewfirstunread
        /// </summary>
        /// <value>viewfirstunread</value>
        [DataMember(Name = "viewfirstunread", EmitDefaultValue = false)]
        public string Viewfirstunread { get; set; }

        /// <summary>
        /// viewlatest
        /// </summary>
        /// <value>viewlatest</value>
        [DataMember(Name = "viewlatest", EmitDefaultValue = false)]
        public string Viewlatest { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModForumSetSubscriptionState200ResponseUrls {\n");
            sb.Append("  Markasread: ").Append(Markasread).Append("\n");
            sb.Append("  Pin: ").Append(Pin).Append("\n");
            sb.Append("  Subscribe: ").Append(Subscribe).Append("\n");
            sb.Append("  View: ").Append(View).Append("\n");
            sb.Append("  Viewfirstunread: ").Append(Viewfirstunread).Append("\n");
            sb.Append("  Viewlatest: ").Append(Viewlatest).Append("\n");
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
